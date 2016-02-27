package com.billyhornfinal.springboot.dao.impl;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Before;
import org.junit.Test;

import com.billyhornfinal.springboot.entities.Food;

public class FoodDaoTest {
	
	private FoodDaoImpl dao;
	private EntityManager mockEm;
	private Food food;

	@Before
	public void setup() {
		dao = new FoodDaoImpl();
		mockEm = mock(EntityManager.class);
		dao.setEm(mockEm);
		food = mock(Food.class);
	}
	
	@Test
	public void addTest(){
		dao.add(null);
		verify(mockEm).persist(null);
	}

	@Test
	public void updateTest() {
		dao.update(null);
		verify(mockEm).merge(null);
	}
	
	@Test
	public void getAllFoodsTest() {
		@SuppressWarnings("unchecked")
		TypedQuery<Food> mockTypedQuery = mock(TypedQuery.class);

		List<Food> expected = new ArrayList<Food>();

		when(mockEm.createQuery(anyString(), eq(Food.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.getResultList()).thenReturn(expected);

		dao.getAllFoods();

		verify(mockTypedQuery).getResultList();
	}
	
	@Test
	public void getByFoodIdTest() {
		@SuppressWarnings("unchecked")
		TypedQuery<Food> mockTypedQuery = mock(TypedQuery.class);

		Food food = new Food();

		when(mockEm.createQuery(anyString(), eq(Food.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.setParameter(anyString(), anyInt())).thenReturn(mockTypedQuery);
		when(mockTypedQuery.getSingleResult()).thenReturn(food);

		dao.getByFoodId(1);

		verify(mockTypedQuery).setParameter(eq("foodId"), eq(1));
	}
	
	@Test
	public void deleteFoodTest() {
		dao.deleteFood(null);
		verify(mockEm).remove(null);
	}
	
}
