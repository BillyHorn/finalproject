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

import com.billyhornfinal.springboot.entities.Animal;

public class AnimalDaoTest {
	
	private AnimalDaoImpl dao;
	private EntityManager mockEm;
	private Animal animal;

	@Before
	public void setup() {
		dao = new AnimalDaoImpl();
		mockEm = mock(EntityManager.class);
		dao.setEm(mockEm);
		animal = mock(Animal.class);
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
	public void getAllAnimalsTest() {
		@SuppressWarnings("unchecked")
		TypedQuery<Animal> mockTypedQuery = mock(TypedQuery.class);

		List<Animal> expected = new ArrayList<Animal>();

		when(mockEm.createQuery(anyString(), eq(Animal.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.getResultList()).thenReturn(expected);

		dao.getAllAnimals();

		verify(mockTypedQuery).getResultList();
	}
	
	@Test
	public void getByAnimalIdTest() {
		@SuppressWarnings("unchecked")
		TypedQuery<Animal> mockTypedQuery = mock(TypedQuery.class);

		Animal animal = new Animal();

		when(mockEm.createQuery(anyString(), eq(Animal.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.setParameter(anyString(), anyInt())).thenReturn(mockTypedQuery);
		when(mockTypedQuery.getSingleResult()).thenReturn(animal);

		dao.getByAnimalId(1);

		verify(mockTypedQuery).setParameter(eq("animalId"), eq(1));
	}
	
	@Test
	public void deleteAnimalTest() {
		dao.deleteAnimal(1);
		verify(mockEm).remove(null);
	}

}
