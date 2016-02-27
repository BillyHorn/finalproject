package com.billyhornfinal.springboot.daos;

import java.util.List;

import com.billyhornfinal.springboot.entities.Enclosure;

/**
 * The methods declared in this interface are to provide basic CRUD functionality related to enclosure objects.
 * @author bHorn
 *
 */
public interface EnclosureDao {
	
	/**
	 * Adds information about an enclosure to storage.
	 * @param enclosure
	 */
	void add(Enclosure enclosure);

	/**
	 * Updates the information about an enclosure already in storage.
	 * @param enclosure
	 */
	void update(Enclosure enclosure);
	
	/**
	 * Retrieves all enclosures currently in storage.
	 * @return
	 */
	List<Enclosure> getAllEnclosures();
	
	/**
	 * Retrieve information about a single enclosure from storage with a matching enclosureId
	 * @param enclosureId
	 * @return
	 */
	Enclosure getByEnclosureId(Integer enclosureId);
	
	/**
	 * Removes information about a single enclosure from storage matching enclosureId
	 * @param enclosureId
	 */
	public void deleteEnclosure(Integer enclosureId);

}
