package com.billyhornfinal.springboot.webservices;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.billyhornfinal.springboot.entities.Enclosure;
import com.billyhornfinal.springboot.service.InvalidInputException;
import com.billyhornfinal.springboot.services.impl.EnclosureServiceImpl;

public class EnclosureWebServiceTest {
	
	private EnclosureWebService enclosureWebService;
	private EnclosureServiceImpl enclosureService;
	private Enclosure enclosure;

	@Before
	public void setup(){
		enclosureWebService = new EnclosureWebService();
		enclosureService = mock(EnclosureServiceImpl.class);
		enclosureWebService.setEnclosureService(enclosureService);
		enclosure = mock(Enclosure.class);
	}
	
	@Test
	public void addEnclosureTest(){
		enclosureWebService.addEnclosure(anyObject());
		verify(enclosureService).add(anyObject());
	}
	
	@Test
	public void getEnclosuresTest() {
		List<Enclosure> enclosures = new ArrayList<Enclosure>();
		
		when(enclosureWebService.getEnclosures()).thenReturn(enclosures);
		
		enclosureWebService.getEnclosures();
		verify(enclosureService).getEnclosures();
	}
	
	@Test
	public void updateEnclosureTest(){
		enclosureWebService.updateEnclosure(1, enclosure);
		verify(enclosureService).update(enclosure);
	}
	
	@Test
	public void getByEnclosureIdTest() throws InvalidInputException {
		
		when(enclosureWebService.getEnclosureByID(anyInt())).thenReturn(enclosure);
		
		enclosureWebService.getEnclosureByID(anyInt());
		verify(enclosureService).getByEnclosureId(anyInt());
	}
	
	@Test
	public void deleteEnclosureTest() {
		enclosureWebService.deleteEnclosure(anyInt());
		verify(enclosureService).deleteEnclosure(anyInt());
	}

}
