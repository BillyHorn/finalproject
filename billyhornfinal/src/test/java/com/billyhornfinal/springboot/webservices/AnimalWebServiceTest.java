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

import com.billyhornfinal.springboot.entities.Animal;
import com.billyhornfinal.springboot.service.InvalidInputException;
import com.billyhornfinal.springboot.services.impl.AnimalServiceImpl;

public class AnimalWebServiceTest {

	private AnimalWebService animalWebService;
	private AnimalServiceImpl animalService;
	private Animal animal;

	@Before
	public void setup(){
		animalWebService = new AnimalWebService();
		animalService = mock(AnimalServiceImpl.class);
		animalWebService.setAnimalService(animalService);
		animal = mock(Animal.class);
	}
	
	@Test
	public void addAnimalTest(){
		animalWebService.addAnimal(anyObject());
		verify(animalService).add(anyObject());
	}
	
	@Test
	public void getAnimalsTest() {
		List<Animal> animals = new ArrayList<Animal>();
		
		when(animalWebService.getAnimals()).thenReturn(animals);
		
		animalWebService.getAnimals();
		verify(animalService).getAnimals();
	}
	
	@Test
	public void updateAnimalTest(){
		animalWebService.updateAnimal(1, animal);
		verify(animalService).update(animal);
	}
	
	@Test
	public void getByAnimalIdTest() throws InvalidInputException {
		
		when(animalWebService.getAnimalByID(anyInt())).thenReturn(animal);
		
		animalWebService.getAnimalByID(anyInt());
		verify(animalService).getByAnimalId(anyInt());
	}
	
	@Test
	public void deleteAnimalTest() {
		animalWebService.deleteAnimal(anyInt());
		verify(animalService).deleteAnimal(anyInt());
	}
	
}
