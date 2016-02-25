package com.billyhornfinal.springboot.service;

import java.util.List;

import com.billyhornfinal.springboot.entities.Food;

public interface FoodService {
	
	/**
	 * Add a new food to the application.
	 * 
	 * @param food
	 */
	void add(Food food);

	/**
	 * Update the information for an existing food. The foodId is used to
	 * find the unique food's information.
	 * 
	 * @param food
	 */
	void update(Food food);

	/**
	 * Retrieve all foods from the application.
	 * @return
	 */
	List<Food> getFoods();

	/**
	 * Retrieve a single food's information if that food's foodId
	 * matches the supplied foodId
	 * 
	 * @param foodId
	 * @return
	 * @throws InvalidInputException
	 *             - the value of foodId provided should not be null or less
	 *             than 0
	 */
	Food getByFoodId(Integer foodId) throws InvalidInputException;

}
