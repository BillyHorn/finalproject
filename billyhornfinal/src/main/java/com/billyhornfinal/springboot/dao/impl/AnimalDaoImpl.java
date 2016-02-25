package com.billyhornfinal.springboot.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.billyhornfinal.springboot.daos.AnimalDao;
import com.billyhornfinal.springboot.entities.Animal;

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

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	public void add(Animal animal) {
		em.persist(animal);
		em.flush();
		
	}

	public void update(Animal animal) {
		em.merge(animal);
		em.flush();
		
	}

	public List<Animal> getAllAnimals() {
		List<Animal> animalList = em.createQuery("SELECT a FROM Animal a", Animal.class).getResultList();
		return animalList;
	}

	public Animal getByAnimalId(Integer animalId) {
		return em.createQuery("SELECT a FROM Animal a WHERE a.animalId = :animalId", Animal.class).setParameter("animalId", animalId).getSingleResult();
	}

}