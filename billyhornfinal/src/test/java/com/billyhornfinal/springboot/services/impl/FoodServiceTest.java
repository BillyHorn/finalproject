package com.billyhornfinal.springboot.services.impl;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.billyhornfinal.springboot.dao.impl.FoodDaoImpl;
import com.billyhornfinal.springboot.entities.Food;
import com.billyhornfinal.springboot.service.InvalidInputException;

public class FoodServiceTest {
	
	private FoodServiceImpl foodService;
	private FoodDaoImpl foodDao;
	private Food food;

	@Before
	public void Setup() {
		foodService = new FoodServiceImpl();
		foodDao = mock(FoodDaoImpl.class);
		foodService.setFoodDao(foodDao);
		food = mock(Food.class);
	}
	
	@Test
	public void addTest() {
		foodService.add(anyObject());
		verify(foodDao).add(anyObject());
	}
	
	@Test
	public void updateTest() {
		foodService.update(anyObject());
		verify(foodDao).update(anyObject());
	}
	
	@Test
	public void getFoodsTest() {
		@SuppressWarnings("unchecked")
		List<Food> foods = mock(List.class);
		
		when(foodDao.getAllFoods()).thenReturn(foods);
		
		foodService.getFoods();
		verify(foodDao).getAllFoods();
	}
	
	@Test
	public void getByFoodIdTest() throws InvalidInputException {
		when(foodDao.getByFoodId(anyInt())).thenReturn(food);
		
		foodService.getByFoodId(anyInt());
		verify(foodDao).getByFoodId(anyInt());
	}
	
	@Test
	public void deleteFoodTest() {
		foodService.deleteFood(anyInt());
		verify(foodDao).deleteFood(anyInt());
	}

}
