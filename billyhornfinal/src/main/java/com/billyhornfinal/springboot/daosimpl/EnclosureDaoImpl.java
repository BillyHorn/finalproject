package com.billyhornfinal.springboot.daosimpl;

import java.util.ArrayList;
import java.util.List;

import com.billyhornfinal.springboot.daos.EnclosureDao;
import com.billyhornfinal.springboot.models.Enclosure;

/**
 * The following Hibernate commands complete the CRUD functionality
 * of the EnclosureDao by connecting Java to the database.
 * @author bhorn
 *
 */
public class EnclosureDaoImpl implements EnclosureDao{

	private List<Enclosure> enclosures = new ArrayList<Enclosure>();
	private Integer nextId = 1;
	
	/**
	 * Method calls EnclosureDao function add and sends
	 * @param enclosure to EnclosureDaoHibernate
	 */
	public void add(Enclosure enclosure) {
		enclosure.setEnclosureId(nextId);
		nextId++;
		enclosures.add(enclosure);
		
	}

	/**
	 * Method calls EnclosureDao function update and sends
	 * @param enclosure to EnclosureDaoHibernate
	 */
	public void update(Enclosure enclosure) {
		Integer index = enclosures.indexOf(enclosure);
		enclosures.set(index, enclosure);
		
	}

	/**
	 * Method returns list of all Enclosures
	 * @return getAllEnclosures
	 */
	public List<Enclosure> getAllEnclosures() {
		return enclosures;
	}

	/**
	 * Method returns single Enclosure with 
	 * @param enclosureId
	 * @return Enclosure
	 */
	public Enclosure getEnclosureById(Integer enclosureId) {
		for(Enclosure e : enclosures){
			if(e.getEnclosureId().equals(enclosureId)){
				return e;
			}
		}
		return null;
	}

	/**
	 * Method removes a single Enclosure
	 * @param enclosureId
	 */
	public void remove(Integer enclosureId) {
		enclosures.remove(enclosureId);
		
	}

}
