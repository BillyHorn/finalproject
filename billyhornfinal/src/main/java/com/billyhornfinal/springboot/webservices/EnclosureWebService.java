package com.billyhornfinal.springboot.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.billyhornfinal.springboot.entities.Enclosure;
import com.billyhornfinal.springboot.service.EnclosureService;
import com.billyhornfinal.springboot.service.InvalidInputException;
import com.billyhornfinal.springboot.services.impl.EnclosureServiceImpl;

@RestController
public class EnclosureWebService {
	
	@Autowired 
	EnclosureService enclosureService;
	
	/**
	 * @param enclosureService the enclosureService to set
	 */
	public void setEnclosureService(EnclosureServiceImpl enclosureService) {
		this.enclosureService = enclosureService;
	}
	/**
	 * Add an enclosure
	 * @param enclosure
	 */
	@RequestMapping(value="/enclosure", method=RequestMethod.POST)
	public void addEnclosure(@RequestBody Enclosure enclosure){
		enclosureService.add(enclosure);
	}
	/**
	 * Get all enclosures
	 * @return
	 */
	@RequestMapping(value="/enclosures", method=RequestMethod.GET)
	public List<Enclosure> getEnclosures(){
		return enclosureService.getEnclosures();
	}
	/**
	 * Update an enclosure
	 * @param id
	 * @param enclosure
	 */
	@RequestMapping(value="/enclosure/{id}", method = RequestMethod.PUT)
	public void updateEnclosure(@PathVariable Integer id, @RequestBody Enclosure enclosure){
		enclosureService.update(enclosure);
	}
	/**
	 * Get a single enclosure
	 * @param id
	 * @return
	 * @throws InvalidInputException
	 */
	@RequestMapping(value="/enclosure/{id}", method=RequestMethod.GET)
	public Enclosure getEnclosureByID(@PathVariable Integer id) throws InvalidInputException{ 
		return enclosureService.getByEnclosureId(id);
	}
	
	/** DELETE
	 * 
	 * @param enclosureId the enclosure being removed from the database
	 */
	@RequestMapping(value="/enclosure/{enclosureId}", method=RequestMethod.DELETE)
	public void deleteEnclosure(@PathVariable Integer enclosureId)
	{
		enclosureService.deleteEnclosure(enclosureId);
	}

}
