package com.billyhornfinal.springboot.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.billyhornfinal.springboot.daos.FoodDao;
import com.billyhornfinal.springboot.entities.Food;

/**
 * Communicates with the database regarding foods.
 * @author bHorn
 *
 */
@Transactional
@Component
public class FoodDaoImpl implements FoodDao{

	@PersistenceContext
	private EntityManager em;

	/**
	 * Set up the entity manager
	 * @param em
	 */
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	/**
	 * Add a food
	 */
	public void add(Food food) {
		em.persist(food);
		em.flush();
		
	}

	/**
	 * Update a food
	 */
	public void update(Food food) {
		em.merge(food);
		em.flush();
		
	}

	/**
	 * Get a list of all foods
	 */
	public List<Food> getAllFoods() {
		List<Food> foodList = em.createQuery("SELECT f FROM Food f", Food.class).getResultList();
		return foodList;
	}

	/**
	 * Get a single food
	 * @param foodId
	 */
	public Food getByFoodId(Integer foodId) {
		return em.createQuery("SELECT f FROM Food f WHERE f.foodId = :foodId", Food.class).setParameter("foodId", foodId).getSingleResult();
	}

	/**
	 * 
	 * @param foodId the food being removed from the database
	 */
	public void deleteFood(Integer foodId) {
		Food food = em.find(Food.class, foodId);
		em.remove(food);
		em.flush();
	}

}
