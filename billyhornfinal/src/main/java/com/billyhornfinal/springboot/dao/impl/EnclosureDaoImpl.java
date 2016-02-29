package com.billyhornfinal.springboot.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.billyhornfinal.springboot.daos.EnclosureDao;
import com.billyhornfinal.springboot.entities.Animal;
import com.billyhornfinal.springboot.entities.Enclosure;
import com.billyhornfinal.springboot.entities.Food;

/**
 * Communicates with the database regarding enclosures.
 * @author bHorn
 *
 */
@Transactional
@Component
public class EnclosureDaoImpl implements EnclosureDao{

	@PersistenceContext
	private EntityManager em;

	/**
	 * set up entity manager
	 * @param em
	 */
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	/**
	 * Add an enclosure
	 */
	public void add(Enclosure enclosure) {
		em.persist(enclosure);
		em.flush();
		
	}

	/**
	 * update an enclosure
	 */
	public void update(Enclosure enclosure) {
		em.merge(enclosure);
		em.flush();
		
	}

	/**
	 * Get a list of all enclosures
	 */
	public List<Enclosure> getAllEnclosures() {
		List<Enclosure> enclosureList = em.createQuery("SELECT e FROM Enclosure e", Enclosure.class).getResultList();
		return enclosureList;
	}

	/**
	 * Get a single enclosure
	 * @param enclosureId
	 */
	public Enclosure getByEnclosureId(Integer enclosureId) {
		return em.createQuery("SELECT e FROM Enclosure e WHERE e.enclosureId = :enclosureId", Enclosure.class).setParameter("enclosureId", enclosureId).getSingleResult();
	}
	
	/**
	 * 
	 * @param enclosureId the enclosure being removed from the database
	 */
	public void deleteEnclosure(Integer enclosureId) {
		Enclosure enclosure = em.find(Enclosure.class, enclosureId);
		em.remove(enclosure);
		em.flush();
	}

}
