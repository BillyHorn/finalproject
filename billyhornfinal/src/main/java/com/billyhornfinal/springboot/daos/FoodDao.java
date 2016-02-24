package com.billyhornfinal.springboot.daos;

import java.util.List;

import com.billyhornfinal.springboot.models.Food;

public interface FoodDao {
	
	/**
	 * Adds information about food to storage.
	 * @param food
	 */
	void add(Food food);
	
	/**
	 * Updates information about Food
	 * @param food
	 */
	void update(Food food);
	
	/**
	 * Gets a list of all food
	 * @return
	 */
	List<Food> getAllFood();
	
	/**
	 * Gets a single food by ID
	 * @param animalId
	 * @return
	 */
	Food getFoodById(Integer foodId);
	
	/**
	 * Removes an item by ID
	 * @param animalId
	 */
	void remove(Integer foodId);

}
