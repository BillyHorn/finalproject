package com.billyhornfinal.springboot.services;

import java.util.List;

import com.billyhornfinal.springboot.models.Animal;

/**
 * The methods declared in this interface are to provide 
 * basic WebService functionality 
 * @author bhorn
 *
 */
public interface AnimalService {
	
	/**
	 * Add a new animal to the application
	 * @param animal
	 */
	void add(Animal animal);
	
	/**
	 * Update an existing animal
	 * @param animal
	 */
	void update(Animal animal);
	
	/**
	 * Retrieve a list of all animals
	 * @return
	 */
	List<Animal> getAnimals();
	
	/**
	 * Retrieve a single animal
	 * @param animalId
	 * @return
	 * @throws InvalidInputException
	 */
	Animal getByAnimalId(Integer animalId) throws InvalidInputException;

}
