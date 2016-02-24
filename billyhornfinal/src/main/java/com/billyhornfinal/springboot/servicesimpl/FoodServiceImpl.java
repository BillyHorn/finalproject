package com.billyhornfinal.springboot.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billyhornfinal.springboot.daos.FoodDao;
import com.billyhornfinal.springboot.models.Food;
import com.billyhornfinal.springboot.services.FoodService;
import com.billyhornfinal.springboot.services.InvalidInputException;

/**
 * The methods declared in this implementation provide basic WebService functionality 
 * @author bhorn
 *
 */
@Service
public class FoodServiceImpl implements FoodService{

	@Autowired
	private FoodDao foodDao;
	
	/**
	 * Sets the foodDao object
	 * @param foodDao
	 */
	public void setfoodDao(FoodDao foodDao) {
		this.foodDao = foodDao;
	}
	
	/**
	 * Add a new food to the application.
	 * @param food
	 */
	public void add(Food food) {
		foodDao.add(food);
		
	}

	/**
	 * Update the information for an existing food
	 * @param food
	 */
	public void update(Food food) {
		foodDao.update(food);
		
	}

	/**
	 * Retrieve all foods from the application.
	 * @return
	 */
	public List<Food> getFoods() {
		List<Food> foods = foodDao.getAllFood();
		return foods;
	}

	/**
	 * Retrieve a single food's information if that food's foodId
	 * matches the supplied foodId
	 * @param foodId
	 * @return
	 * @throws InvalidInputException
	 *             - the value of foodId provided should not be null or less
	 *             than 0
	 */
	public Food getByFoodId(Integer foodId) throws InvalidInputException {
		if (foodId == null || foodId < 0) {
			throw new InvalidInputException("foodId.NullOrNegative");
		}
		return foodDao.getFoodById(foodId);
	}

}
