package com.billyhornfinal.springboot.services;

import java.util.List;

import com.billyhornfinal.springboot.models.Enclosure;

/**
 * The methods declared in this interface are to provide 
 * basic WebService functionality 
 * @author bhorn
 *
 */
public interface EnclosureService {
	
	/**
	 * Add a new enclosure to the application
	 * @param enclosure
	 */
	void add(Enclosure enclosure);
	
	/**
	 * Update an existing enclosure
	 * @param enclosure
	 */
	void update(Enclosure enclosure);
	
	/**
	 * Retrieve a list of all enclosures
	 * @return
	 */
	List<Enclosure> getEnclosures();
	
	/**
	 * Retrieve a single enclosure
	 * @param enclosureId
	 * @return
	 * @throws InvalidInputException
	 */
	Enclosure getByEnclosureId(Integer enclosureId) throws InvalidInputException;

}
