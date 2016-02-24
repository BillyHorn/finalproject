package com.billyhornfinal.springboot.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billyhornfinal.springboot.daos.EnclosureDao;
import com.billyhornfinal.springboot.models.Enclosure;
import com.billyhornfinal.springboot.services.EnclosureService;
import com.billyhornfinal.springboot.services.InvalidInputException;

/**
 * The methods declared in this implementation provide basic WebService functionality 
 * @author bhorn
 *
 */
@Service
public class EnclosureServiceImpl implements EnclosureService{

	@Autowired
	private EnclosureDao enclosureDao;
	
	/**
	 * Sets the enclosureDao object
	 * @param enclosureDao
	 */
	public void setenclosureDao(EnclosureDao enclosureDao) {
		this.enclosureDao = enclosureDao;
	}

	/**
	 * Add a new enclosure to the application.
	 * @param enclosure
	 */
	public void add(Enclosure enclosure) {
		enclosureDao.add(enclosure);
		
	}

	/**
	 * Update the information for an existing enclosure
	 * @param enclosure
	 */
	public void update(Enclosure enclosure) {
		enclosureDao.update(enclosure);
		
	}

	/**
	 * Retrieve all enclosures from the application.
	 * @return
	 */
	public List<Enclosure> getEnclosures() {
		List<Enclosure> enclosures = enclosureDao.getAllEnclosures();
		return enclosures;
	}

	/**
	 * Retrieve a single enclosure's information if that enclosure's enclosureId
	 * matches the supplied enclosureId
	 * @param enclosureId
	 * @return
	 * @throws InvalidInputException
	 *             - the value of enclosureId provided should not be null or less
	 *             than 0
	 */
	public Enclosure getByEnclosureId(Integer enclosureId) throws InvalidInputException {
		if (enclosureId == null || enclosureId < 0) {
			throw new InvalidInputException("enclosureId.NullOrNegative");
		}
		return enclosureDao.getEnclosureById(enclosureId);
	}

}
