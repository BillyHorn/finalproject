package com.billyhornfinal.springboot.daos;

import java.util.List;

import com.billyhornfinal.springboot.models.Enclosure;

public interface EnclosureDao {
	
	/**
	 * Adds information about an enclosure to storage.
	 * @param enclosure
	 */
	void add(Enclosure enclosure);
	
	/**
	 * Updates information about an enclosure
	 * @param enclosure
	 */
	void update(Enclosure enclosure);
	
	/**
	 * Gets a list of all enclosures
	 * @return
	 */
	List<Enclosure> getAllEnclosures();
	
	/**
	 * Gets a single enclosure by ID
	 * @param enclosureId
	 * @return
	 */
	Enclosure getEnclosureById(Integer enclosureId);
	
	/**
	 * Removes an item by ID
	 * @param animalId
	 */
	void remove(Integer enclosureId);

}
