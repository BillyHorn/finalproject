package com.billyhornfinal.springboot.services;

import java.util.List;

import com.billyhornfinal.springboot.models.Food;

/**
 * The methods declared in this interface are to provide 
 * basic WebService functionality 
 * @author bhorn
 *
 */
public interface FoodService {
	
	/**
	 * Add a new food to the application
	 * @param food
	 */
	void add(Food food);
	
	/**
	 * Update an existing food
	 * @param food
	 */
	void update(Food food);
	
	/**
	 * Retrieve a list of all foods
	 * @return
	 */
	List<Food> getFoods();
	
	/**
	 * Retrieve a single food
	 * @param foodId
	 * @return
	 * @throws InvalidInputException
	 */
	Food getByFoodId(Integer foodId) throws InvalidInputException;

}
