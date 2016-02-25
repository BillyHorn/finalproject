package com.billyhornfinal.springboot.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billyhornfinal.springboot.dao.impl.AnimalDaoImpl;
import com.billyhornfinal.springboot.daos.AnimalDao;
import com.billyhornfinal.springboot.entities.Animal;
import com.billyhornfinal.springboot.service.AnimalService;
import com.billyhornfinal.springboot.service.InvalidInputException;

@Service
public class AnimalServiceImpl implements AnimalService{

	@Autowired
	private AnimalDao animalDao;
	
	/**
	 * @param animalDao the animalDao to set
	 */
	public void setAnimalDao(AnimalDaoImpl animalDao) {
		this.animalDao = animalDao;
	}
	
	public void add(Animal animal) {
		animalDao.add(animal);
		
	}

	public void update(Animal animal) {
		animalDao.update(animal);
		
	}

	public List<Animal> getAnimals() {
		return animalDao.getAllAnimals();
	}

	public Animal getByAnimalId(Integer animalId) throws InvalidInputException {
		return animalDao.getByAnimalId(animalId);
	}

}
