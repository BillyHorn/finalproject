package com.billyhornfinal.springboot.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billyhornfinal.springboot.dao.impl.EnclosureDaoImpl;
import com.billyhornfinal.springboot.daos.EnclosureDao;
import com.billyhornfinal.springboot.entities.Enclosure;
import com.billyhornfinal.springboot.service.EnclosureService;
import com.billyhornfinal.springboot.service.InvalidInputException;

@Service
public class EnclosureServiceImpl implements EnclosureService{

	@Autowired
	private EnclosureDao enclosureDao;
	
	/**
	 * @param enclosureDao the enclosureDao to set
	 */
	public void setEnclosureDao(EnclosureDaoImpl enclosureDao) {
		this.enclosureDao = enclosureDao;
	}
	
	/**
	 * Add an enclosure
	 */
	public void add(Enclosure enclosure) {
		enclosureDao.add(enclosure);
		
	}

	/**
	 * Update an enclosure
	 */
	public void update(Enclosure enclosure) {
		enclosureDao.update(enclosure);
		
	}

	/**
	 * Get a list of all enclosures
	 */
	public List<Enclosure> getEnclosures() {
		return enclosureDao.getAllEnclosures();
	}

	/**
	 * Get a single enclosure
	 */
	public Enclosure getByEnclosureId(Integer enclosureId) throws InvalidInputException {
		return enclosureDao.getByEnclosureId(enclosureId);
	}

	/**
	 * 
	 * @param enclosureId the enclosure to be deleted from the database
	 */
	@Override
	public void deleteEnclosure(Integer enclosureId) {
		enclosureDao.deleteEnclosure(enclosureId);
	}

}
