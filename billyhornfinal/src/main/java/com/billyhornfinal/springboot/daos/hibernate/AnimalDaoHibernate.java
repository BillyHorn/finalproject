package com.billyhornfinal.springboot.daos.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.billyhornfinal.springboot.daos.AnimalDao;
import com.billyhornfinal.springboot.models.Animal;

/**
 * The hibernate functionality for the animal table's Database access
 * @author bhorn
 *
 */

@Transactional
@Component
public class AnimalDaoHibernate implements AnimalDao{
	
	@PersistenceContext
	private EntityManager em;
	
	/**
	 * Sets the entity manager
	 * @param em
	 */
	public void setEm(EntityManager em) {
		this.em = em;
	}

	/**
	 * Adds a new row in the animal table in the database
	 * @param animal
	 */
	public void add(Animal animal) {
		em.persist(animal);		
		
	}

	/**
	 * Updates a row in the animal table in the database
	 * @param animal
	 */
	public void update(Animal animal) {
		em.merge(animal);
		
	}

	/**
	 * Returns a list of all rows in the animal table from the database
	 */
	public List<Animal> getAllAnimals() {
		return em
				.createQuery("SELECT animal FROM Animal animal", Animal.class)
				.getResultList();
	}

	/**
	 * Returns a single row from the animal table in the database
	 * @param animalId
	 */
	public Animal getAnimalById(Integer animalId) {
		return em
				.createQuery("SELECT animal FROM Animal animal WHERE animal.animalId = :id", Animal.class)
				.setParameter("id", animalId)
				.getSingleResult();
	}
	
	/**
	 * Removes a row in the animal table from the database
	 * @param animalId
	 */
	public void remove(Integer animalId){
		Animal a = em.find(Animal.class, animalId);
		em.remove(a);
	}

}
