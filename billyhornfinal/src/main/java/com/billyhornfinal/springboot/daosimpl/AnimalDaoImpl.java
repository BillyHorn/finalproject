package com.billyhornfinal.springboot.daosimpl;

import java.util.ArrayList;
import java.util.List;

import com.billyhornfinal.springboot.daos.AnimalDao;
import com.billyhornfinal.springboot.models.Animal;

/**
 * The following Hibernate commands complete the CRUD functionality
 * of the AnimalDao by connecting Java to the database.
 * @author bhorn
 *
 */

public class AnimalDaoImpl implements AnimalDao{

	private List<Animal> animals = new ArrayList<Animal>();
	private Integer nextId = 1;
	
	/**
	 * Method calls AnimalDao function add and sends
	 * @param animal to AnimalDaoHibernate
	 */
	public void add(Animal animal) {
		animal.setAnimalId(nextId);
		nextId++;
		animals.add(animal);
		
	}

	/**
	 * Method calls AnimalDao function update and sends
	 * @param animal to AnimalDaoHibernate
	 */
	public void update(Animal animal) {
		Integer index = animals.indexOf(animal);
		animals.set(index, animal);
		
	}

	/**
	 * Method returns list of all Animals
	 * @return getAllAnimals
	 */
	public List<Animal> getAllAnimals() {
		return animals;
	}

	/**
	 * Method returns single Animal with 
	 * @param animalId
	 * @return Animal
	 */
	public Animal getAnimalById(Integer animalId) {
		for(Animal a : animals){
			if(a.getAnimalId().equals(animalId)){
				return a;
			}
		}
		return null;
	}

	/**
	 * Method removes a single Animal
	 * @param animalId
	 */
	public void remove(Integer animalId) {
		animals.remove(animalId);
		
	}

}
