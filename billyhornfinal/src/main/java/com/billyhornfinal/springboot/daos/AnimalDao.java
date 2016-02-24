package com.billyhornfinal.springboot.daos;

import java.util.List;

import com.billyhornfinal.springboot.models.Animal;

/**
 * 
 * Methods in the interface are for basic CRUD functionality
 * @author bhorn
 *
 */
public interface AnimalDao {
	
	/**
	 * Adds information about an animal to storage.
	 * @param animal
	 */
	void add(Animal animal);
	
	/**
	 * Updates information about an animal
	 * @param animal
	 */
	void update(Animal animal);
	
	/**
	 * Gets a list of all animals
	 * @return
	 */
	List<Animal> getAllAnimals();
	
	/**
	 * Gets a single animal by ID
	 * @param animalId
	 * @return
	 */
	Animal getAnimalById(Integer animalId);
	
	/**
	 * Removes an item by ID
	 * @param animalId
	 */
	void remove(Integer animalId);

}
