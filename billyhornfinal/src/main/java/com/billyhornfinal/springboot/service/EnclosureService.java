package com.billyhornfinal.springboot.service;

import java.util.List;

import com.billyhornfinal.springboot.entities.Enclosure;

public interface EnclosureService {
	
	/**
	 * Add a new enclosure to the application.
	 * 
	 * @param enclosure
	 */
	void add(Enclosure enclosure);

	/**
	 * Update the information for an existing enclosure. The enclosureId is used to
	 * find the unique enclosure's information.
	 * 
	 * @param enclosure
	 */
	void update(Enclosure enclosure);

	/**
	 * Retrieve all enclosures from the application.
	 * @return
	 */
	List<Enclosure> getEnclosures();

	/**
	 * Retrieve a single enclosure's information if that enclosure's enclosureId
	 * matches the supplied enclosureId
	 * 
	 * @param enclosureId
	 * @return
	 * @throws InvalidInputException
	 *             - the value of enclosureId provided should not be null or less
	 *             than 0
	 */
	Enclosure getByEnclosureId(Integer enclosureId) throws InvalidInputException;

}
