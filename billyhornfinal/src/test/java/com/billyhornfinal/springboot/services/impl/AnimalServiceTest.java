package com.billyhornfinal.springboot.services.impl;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.billyhornfinal.springboot.dao.impl.AnimalDaoImpl;
import com.billyhornfinal.springboot.entities.Animal;
import com.billyhornfinal.springboot.service.InvalidInputException;

public class AnimalServiceTest {
	
	private AnimalServiceImpl animalService;
	private AnimalDaoImpl animalDao;
	private Animal animal;

	@Before
	public void Setup() {
		animalService = new AnimalServiceImpl();
		animalDao = mock(AnimalDaoImpl.class);
		animalService.setAnimalDao(animalDao);
		animal = mock(Animal.class);
	}
	
	@Test
	public void addTest() {
		animalService.add(anyObject());
		verify(animalDao).add(anyObject());
	}
	
	@Test
	public void updateTest() {
		animalService.update(anyObject());
		verify(animalDao).update(anyObject());
	}
	
	@Test
	public void getAnimalsTest() {
		@SuppressWarnings("unchecked")
		List<Animal> animals = mock(List.class);
		
		when(animalDao.getAllAnimals()).thenReturn(animals);
		
		animalService.getAnimals();
		verify(animalDao).getAllAnimals();
	}
	
	@Test
	public void getByAnimalIdTest() throws InvalidInputException {
		when(animalDao.getByAnimalId(anyInt())).thenReturn(animal);
		
		animalService.getByAnimalId(anyInt());
		verify(animalDao).getByAnimalId(anyInt());
	}
	
	@Test
	public void deleteAnimalTest() {
		animalService.deleteAnimal(anyInt());
		verify(animalDao).deleteAnimal(anyInt());
	}

}
