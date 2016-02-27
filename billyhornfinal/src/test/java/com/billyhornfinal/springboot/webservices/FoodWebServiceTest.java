package com.billyhornfinal.springboot.webservices;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.billyhornfinal.springboot.entities.Food;
import com.billyhornfinal.springboot.service.InvalidInputException;
import com.billyhornfinal.springboot.services.impl.FoodServiceImpl;

public class FoodWebServiceTest {
	
	private FoodWebService foodWebService;
	private FoodServiceImpl foodService;
	private Food food;

	@Before
	public void setup(){
		foodWebService = new FoodWebService();
		foodService = mock(FoodServiceImpl.class);
		foodWebService.setFoodService(foodService);
		food = mock(Food.class);
	}
	
	@Test
	public void addFoodTest(){
		foodWebService.addFood(anyObject());
		verify(foodService).add(anyObject());
	}
	
	@Test
	public void getFoodsTest() {
		List<Food> foods = new ArrayList<Food>();
		
		when(foodWebService.getFoods()).thenReturn(foods);
		
		foodWebService.getFoods();
		verify(foodService).getFoods();
	}
	
	@Test
	public void updateFoodTest(){
		foodWebService.updateFood(1, food);
		verify(foodService).update(food);
	}
	
	@Test
	public void getByFoodIdTest() throws InvalidInputException {
		
		when(foodWebService.getFoodByID(anyInt())).thenReturn(food);
		
		foodWebService.getFoodByID(anyInt());
		verify(foodService).getByFoodId(anyInt());
	}
	
	@Test
	public void deleteFoodTest() {
		foodWebService.deleteFood(anyInt());
		verify(foodService).deleteFood(anyInt());
	}
	
}
