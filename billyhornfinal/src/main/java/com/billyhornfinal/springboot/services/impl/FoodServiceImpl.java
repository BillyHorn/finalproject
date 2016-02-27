package com.billyhornfinal.springboot.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billyhornfinal.springboot.dao.impl.FoodDaoImpl;
import com.billyhornfinal.springboot.daos.FoodDao;
import com.billyhornfinal.springboot.entities.Food;
import com.billyhornfinal.springboot.service.FoodService;
import com.billyhornfinal.springboot.service.InvalidInputException;

@Service
public class FoodServiceImpl implements FoodService{

	@Autowired
	private FoodDao foodDao;
	
	/**
	 * @param foodDao the foodDao to set
	 */
	public void setFoodDao(FoodDaoImpl foodDao) {
		this.foodDao = foodDao;
	}
	
	public void add(Food food) {
		foodDao.add(food);
		
	}

	public void update(Food food) {
		foodDao.update(food);
		
	}

	public List<Food> getFoods() {
		return foodDao.getAllFoods();
	}

	public Food getByFoodId(Integer foodId) throws InvalidInputException {
		return foodDao.getByFoodId(foodId);
	}

	/**
	 * 
	 * @param foodId the food to be deleted from the database
	 */
	public void deleteFood(Integer foodId) {
		foodDao.deleteFood(foodId);
	}

}
