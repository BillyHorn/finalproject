package com.billyhornfinal.springboot.daos.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.billyhornfinal.springboot.daos.EnclosureDao;
import com.billyhornfinal.springboot.models.Enclosure;

/**
 * The hibernate functionality for the enclosure table's Database access
 * @author bhorn
 *
 */

@Component
@Transactional
public class EnclosureDaoHibernate implements EnclosureDao{
	
	@PersistenceContext
	private EntityManager em;
	
	/**
	 * Sets the entity manager
	 * @param em
	 */
	public void setEm(EntityManager em) {
		this.em = em;
	}

	/**
	 * Adds a new row in the enclosure table in the database
	 * @param enclosure
	 */
	public void add(Enclosure enclosure) {
		em.persist(enclosure);
		
	}

	/**
	 * Updates a row in the enclosure table in the database
	 * @param enclosure
	 */
	public void update(Enclosure enclosure) {
		em.merge(enclosure);
		
	}

	/**
	 * Returns a list of all rows in the enclosure table from the database
	 */
	public List<Enclosure> getAllEnclosures() {
		return em
				.createQuery("SELECT enclosure FROM Enclosure enclosure", Enclosure.class)
				.getResultList();
	}

	/**
	 * Returns a single row from the enclosure table in the database
	 * @param enclosureId
	 */
	public Enclosure getEnclosureById(Integer enclosureId) {
		return em
				.createQuery("SELECT enclosure FROM Enclosure enclosure WHERE enclosure.enclosureId = :id", Enclosure.class)
				.setParameter("id", enclosureId)
				.getSingleResult();
	}

	
	/**
	 * Removes a row in the enclosure table from the database
	 * @param enclosureId
	 */
	public void remove(Integer enclosureId) {
		Enclosure e = em.find(Enclosure.class, enclosureId);
		em.remove(e);
		
	}

}
