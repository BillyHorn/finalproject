package com.billyhornfinal.springboot.service;

import java.util.List;

import com.billyhornfinal.springboot.entities.Animal;

public interface AnimalService {
	
	/**
	 * Add a new animal to the application.
	 * 
	 * @param animal
	 */
	void add(Animal animal);

	/**
	 * Update the information for an existing animal. The animalId is used to
	 * find the unique animal's information.
	 * 
	 * @param animal
	 */
	void update(Animal animal);

	/**
	 * Retrieve all animals from the application.
	 * @return
	 */
	List<Animal> getAnimals();

	
	/**
	 * Retrieve a single animal's information if that animal's animalId
	 * matches the supplied animalId
	 * 
	 * @param animalId
	 * @return
	 * @throws InvalidInputException
	 *             - the value of animalId provided should not be null or less
	 *             than 0
	 */
	Animal getByAnimalId(Integer animalId) throws InvalidInputException;

}
