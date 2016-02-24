package com.billyhornfinal.springboot.daos.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.billyhornfinal.springboot.daos.ConditionDao;
import com.billyhornfinal.springboot.models.Condition;

/**
 * The hibernate functionality for the condition table's Database access
 * @author bhorn
 *
 */

@Transactional
@Component
public class ConditionDaoHibernate implements ConditionDao{
	
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
	 * Returns a list of all rows from the condition table in the database
	 */
	public List<Condition> getAllConditions() {
		return em
				.createQuery("SELECT condition FROM Condition condition", Condition.class)
				.getResultList();
	}

	/**
	 * Returns a single row from the condition table in the database
	 * @param conditionId
	 */
	public Condition getConditionById(Integer conditionId) {
		return em
				.createQuery("SELECT condition FROM Condition condition WHERE condiiton.conditionId = :id", Condition.class)
				.setParameter("id",  conditionId)
				.getSingleResult();
	}

}
