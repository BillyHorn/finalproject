package com.billyhornfinal.springboot.daos.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.billyhornfinal.springboot.daos.FoodDao;
import com.billyhornfinal.springboot.models.Food;

/**
 * The hibernate functionality for the food table's Database access
 * @author bhorn
 *
 */

public class FoodDaoHibernate implements FoodDao{
	
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
	 * Adds a new row in the food table in the database
	 * @param food
	 */
	public void add(Food food) {
		em.persist(food);
		
	}

	/**
	 * Updates a row in the food table in the database
	 * @param food
	 */
	public void update(Food food) {
		em.merge(food);
		
	}

	/**
	 * Returns a list of all rows in the food table from the database
	 */
	public List<Food> getAllFood() {
		return em
				.createQuery("SELECT food FROM Food food", Food.class)
				.getResultList();
	}

	/**
	 * Returns a single row from the food table in the database
	 * @param foodId
	 */
	public Food getFoodById(Integer foodId) {
		return em
				.createQuery("SELECT food FROM Food food WHERE food.foodId = :id", Food.class)
				.setParameter("id", foodId)
				.getSingleResult();
	}

	/**
	 * Removes a row in the food table from the database
	 * @param foodId
	 */
	public void remove(Integer foodId) {
		Food f = em.find(Food.class, foodId);
		em.remove(f);
		
	}

}
