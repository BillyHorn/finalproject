package com.billyhornfinal.springboot.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.billyhornfinal.springboot.daos.AnimalDao;
import com.billyhornfinal.springboot.entities.Animal;
import com.billyhornfinal.springboot.entities.Enclosure;

/**
 * Communicates with the database regarding animals.
 * @author bHorn
 *
 */
@Transactional
@Component
public class AnimalDaoImpl implements AnimalDao{

	@PersistenceContext
	private EntityManager em;

	/**
	 * Set up the entity manager
	 * @param em
	 */
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	/**
	 * Add an animal
	 * 
	 */
	public void add(Animal animal) {
		em.persist(animal);
		em.flush();
		
	}

	/**
	 * Update an animal
	 */
	public void update(Animal animal) {
		em.merge(animal);
		em.flush();
		
	}

	/**
	 * Get a list of all animals
	 */
	public List<Animal> getAllAnimals() {
		List<Animal> animalList = em.createQuery("SELECT a FROM Animal a", Animal.class).getResultList();
		return animalList;
	}

	/**
	 * Fetch a single animal at animalId
	 */
	public Animal getByAnimalId(Integer animalId) {
		return em.createQuery("SELECT a FROM Animal a WHERE a.animalId = :animalId", Animal.class).setParameter("animalId", animalId).getSingleResult();
	}

	/**
	 * 
	 * @param animalId the animal being removed from the database
	 */
	@Override
	public void deleteAnimal(Integer animalId) {
		Animal animal = em.find(Animal.class, animalId);
		em.remove(animal);
		em.flush();
		
	}

}
