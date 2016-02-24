package com.billyhornfinal.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.billyhornfinal.springboot.models.Enclosure;
import com.billyhornfinal.springboot.services.EnclosureService;
import com.billyhornfinal.springboot.services.InvalidInputException;

/**
 * The web service for the enclosure table's Database access
 * @author bhorn
 *
 */
@RestController
public class EnclosureWebService {
	
	@Autowired
	private EnclosureService enclosureService;
	
	/**
	 * Sets a EnclosureService object
	 * @param enclosureService
	 */
	public void setEnclosureService(EnclosureService enclosureService) {
		this.enclosureService = enclosureService;
	}
	
	/**
	 * Returns a list of all the enclosures.
	 * @return List<Enclosure>
	 */
	@RequestMapping(value="/enclosures", method = RequestMethod.GET)
	public List<Enclosure> getEnclosures(){
		System.out.println("blah");
		return enclosureService.getEnclosures();
	}	
	
	/**
     * Returns the information for an enclosure corresponding to the passed-in id.
     * @param id
     * @return Enclosure
     * @throws InvalidInputException
     */
	@RequestMapping(value="/enclosures/{id}", method=RequestMethod.GET)
	public Enclosure getEnclosureByID(@PathVariable Integer id) throws InvalidInputException{ 
		return enclosureService.getByEnclosureId(id);
	}
	
	/**
	 * Add a new enclosure to the application.
	 * @param enclosure
	 */
	@RequestMapping(value = "/enclosures", method = RequestMethod.POST)
	public void addEnclosure(@RequestBody Enclosure enclosure) {

		enclosureService.add(enclosure);
	}
	
	/**
	 * Edits an existing enclosure in the enclosure table
	 * @param id
	 * @param enclosure
	 */
	@RequestMapping(value="/enclosures/{id}", method = RequestMethod.PUT)
	public void updateEnclosure(@PathVariable Integer id, @RequestBody Enclosure enclosure){
		enclosureService.update(enclosure);
	}

}
