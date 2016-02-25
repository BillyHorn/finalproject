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

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	public void add(Food food) {
		em.persist(food);
		em.flush();
		
	}

	public void update(Food food) {
		em.merge(food);
		em.flush();
		
	}

	public List<Food> getAllFoods() {
		List<Food> foodList = em.createQuery("SELECT f FROM Food f", Food.class).getResultList();
		return foodList;
	}

	public Food getByFoodId(Integer foodId) {
		return em.createQuery("SELECT f FROM Food f WHERE f.foodId = :foodId", Food.class).setParameter("foodId", foodId).getSingleResult();
	}

}
