package com.billyhornfinal.springboot.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billyhornfinal.springboot.daos.AnimalDao;
import com.billyhornfinal.springboot.models.Animal;
import com.billyhornfinal.springboot.services.AnimalService;
import com.billyhornfinal.springboot.services.InvalidInputException;

/**
 * The methods declared in this implementation provide basic WebService functionality 
 * @author bhorn
 *
 */
@Service
public class AnimalServiceImpl implements AnimalService{

	@Autowired
	private AnimalDao animalDao;
	
	/**
	 * Sets the animalDao object
	 * @param animalDao
	 */
	public void setanimalDao(AnimalDao animalDao) {
		this.animalDao = animalDao;
	}
	
	/**
	 * Add a new animal to the application.
	 * @param animal
	 */
	public void add(Animal animal) {
		animalDao.add(animal);
		
	}

	/**
	 * Update the information for an existing animal
	 * @param animal
	 */
	public void update(Animal animal) {
		animalDao.update(animal);
		
	}

	/**
	 * Retrieve all animals from the application.
	 * @return
	 */
	public List<Animal> getAnimals() {
		List<Animal> animals = animalDao.getAllAnimals();
		return animals;
	}

	/**
	 * Retrieve a single animal's information if that animal's animalId
	 * matches the supplied animalId
	 * @param animalId
	 * @return
	 * @throws InvalidInputException
	 *             - the value of animalId provided should not be null or less
	 *             than 0
	 */
	public Animal getByAnimalId(Integer animalId) throws InvalidInputException {
		if (animalId == null || animalId < 0) {
			throw new InvalidInputException("animalId.NullOrNegative");
		}
		return animalDao.getAnimalById(animalId);
	}

}
