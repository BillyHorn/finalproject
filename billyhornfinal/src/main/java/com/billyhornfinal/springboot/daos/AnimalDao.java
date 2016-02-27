package com.billyhornfinal.springboot.daos;

import java.util.List;

import com.billyhornfinal.springboot.entities.Animal;

/**
 * The methods declared in this interface are to provide basic CRUD functionality related to animal objects.
 * @author bHorn
 *
 */
public interface AnimalDao {
	
	/**
	 * Adds information about an animal to storage.
	 * @param animal
	 */
	void add(Animal animal);

	/**
	 * Updates the information about an animal already in storage.
	 * @param animal
	 */
	void update(Animal animal);
	
	/**
	 * Retrieves all animals currently in storage.
	 * @return
	 */
	List<Animal> getAllAnimals();
	
	/**
	 * Retrieve information about a single animal from storage with a matching animalId
	 * @param animalId
	 * @return
	 */
	Animal getByAnimalId(Integer animalId);
	
	/**
	 * Removes information about a single animal from storage matching animalId
	 * @param animalId
	 */
	public void deleteAnimal(Integer animalId);

}
