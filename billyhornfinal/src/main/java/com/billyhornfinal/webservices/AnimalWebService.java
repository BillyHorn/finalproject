package com.billyhornfinal.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.billyhornfinal.springboot.models.Animal;
import com.billyhornfinal.springboot.services.AnimalService;
import com.billyhornfinal.springboot.services.InvalidInputException;

/**
 * The web service for the Animal table's Database access
 * @author bhorn
 *
 */
@RestController
public class AnimalWebService {
	
	@Autowired
	private AnimalService animalService;
	
	/**
	 * Sets a AnimalService object
	 * @param animalService
	 */
	public void setAnimalService(AnimalService animalService) {
		this.animalService = animalService;
	}
	
	/**
	 * Returns a list of all the animals.
	 * @return List<Animal>
	 */
	@RequestMapping(value="/animals", method = RequestMethod.GET)
	public List<Animal> getanimals(){
		return animalService.getAnimals();
	}	

	/**
     * Returns the information for an animal corresponding to the passed-in id.
     * @param id
     * @return Animal
     * @throws InvalidInputException
     */
	@RequestMapping(value="/animals/{id}", method=RequestMethod.GET)
	public Animal getAnimalByID(@PathVariable Integer id) throws InvalidInputException{ 
		return animalService.getByAnimalId(id);
	}
	
	/**
	 * Add a new animal to the application.
	 * @param animal
	 */
	@RequestMapping(value = "/animals", method = RequestMethod.POST)
	public void addAnimal(@RequestBody Animal animal) {

		animalService.add(animal);
	}
	
	/**
	 * Edits an existing animal in the animal table
	 * @param id
	 * @param animal
	 */
	@RequestMapping(value="/animals/{id}", method = RequestMethod.PUT)
	public void updateAnimal(@PathVariable Integer id, @RequestBody Animal animal){
		animalService.update(animal);
	}
}
