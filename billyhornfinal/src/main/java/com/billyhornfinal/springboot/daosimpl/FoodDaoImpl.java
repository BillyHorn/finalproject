package com.billyhornfinal.springboot.daosimpl;

import java.util.ArrayList;
import java.util.List;

import com.billyhornfinal.springboot.daos.FoodDao;
import com.billyhornfinal.springboot.models.Food;

public class FoodDaoImpl implements FoodDao{

	private List<Food> foods = new ArrayList<Food>();
	private Integer nextId = 1;
	
	/**
	 * Method calls FoodDao function add and sends
	 * @param food to FoodDaoHibernate
	 */
	public void add(Food food) {
		food.setFoodId(nextId);
		nextId++;
		foods.add(food);
		
	}

	/**
	 * Method calls FoodDao function update and sends
	 * @param food to FoodDaoHibernate
	 */
	public void update(Food food) {
		Integer index = foods.indexOf(food);
		foods.set(index, food);
		
	}

	/**
	 * Method returns list of all Foods
	 * @return getAllFoods
	 */
	public List<Food> getAllFood() {
		return foods;
	}

	/**
	 * Method returns single Food with 
	 * @param foodId
	 * @return Food
	 */
	public Food getFoodById(Integer foodId) {
		for(Food f : foods){
			if(f.getFoodId().equals(foodId)){
				return f;
			}
		}
		return null;
	}

	/**
	 * Method removes a single Food
	 * @param foodId
	 */
	public void remove(Integer foodId) {
		foods.remove(foodId);
		
	}

}
