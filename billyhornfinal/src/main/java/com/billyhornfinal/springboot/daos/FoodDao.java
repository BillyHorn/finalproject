package com.billyhornfinal.springboot.daos;

import java.util.List;

import com.billyhornfinal.springboot.entities.Food;

/**
 * The methods declared in this interface are to provide basic CRUD functionality related to food objects.
 * @author bHorn
 *
 */
public interface FoodDao {
	
	/**
	 * Adds information about food to storage.
	 * @param food
	 */
	void add(Food food);

	/**
	 * Updates the information about an food already in storage.
	 * @param food
	 */
	void update(Food food);
	
	/**
	 * Retrieves all foods currently in storage.
	 * @return
	 */
	List<Food> getAllFoods();
	
	/**
	 * Retrieve information about a single food from storage with a matching foodId
	 * @param foodId
	 * @return
	 */
	Food getByFoodId(Integer foodId);
	
	/**
	 * Removes information about a single food from storage matching foodId
	 * @param food
	 */
	public void deleteFood(Integer foodId);

}
