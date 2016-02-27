package com.billyhornfinal.springboot.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.billyhornfinal.springboot.entities.Animal;
import com.billyhornfinal.springboot.service.AnimalService;
import com.billyhornfinal.springboot.service.InvalidInputException;
import com.billyhornfinal.springboot.services.impl.AnimalServiceImpl;

@RestController
public class AnimalWebService {

	@Autowired 
	AnimalService animalService;
	
	/**
	 * @param animalService the animalService to set
	 */
	public void setAnimalService(AnimalServiceImpl animalService) {
		this.animalService = animalService;
	}
	
	@RequestMapping(value="/animal", method=RequestMethod.POST)
	public void addAnimal(@RequestBody Animal animal){
		animalService.add(animal);
	}
	
	@RequestMapping(value="/animals", method=RequestMethod.GET)
	public List<Animal> getAnimals(){
		return animalService.getAnimals();
	}
	
	@RequestMapping(value="/animal/{id}", method = RequestMethod.PUT)
	public void updateAnimal(@PathVariable Integer id, @RequestBody Animal animal){
		animalService.update(animal);
	}
	
	@RequestMapping(value="/animal/{id}", method=RequestMethod.GET)
	public Animal getAnimalByID(@PathVariable Integer id) throws InvalidInputException{ 
		return animalService.getByAnimalId(id);
	}
	
	/** DELETE
	 * 
	 * @param animalId the animal being removed from the database
	 */
	@RequestMapping(value="/animal/{animalId}", method=RequestMethod.DELETE)
	public void deleteAnimal(@PathVariable Integer animalId)
	{
		animalService.deleteAnimal(animalId);
	}
	
}
