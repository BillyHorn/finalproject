package com.billyhornfinal.springboot.services.impl;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.billyhornfinal.springboot.dao.impl.EnclosureDaoImpl;
import com.billyhornfinal.springboot.entities.Enclosure;
import com.billyhornfinal.springboot.service.InvalidInputException;

public class EnclosureServiceTest {
	
	private EnclosureServiceImpl enclosureService;
	private EnclosureDaoImpl enclosureDao;
	private Enclosure enclosure;

	@Before
	public void Setup() {
		enclosureService = new EnclosureServiceImpl();
		enclosureDao = mock(EnclosureDaoImpl.class);
		enclosureService.setEnclosureDao(enclosureDao);
		enclosure = mock(Enclosure.class);
	}
	
	@Test
	public void addTest() {
		enclosureService.add(anyObject());
		verify(enclosureDao).add(anyObject());
	}
	
	@Test
	public void updateTest() {
		enclosureService.update(anyObject());
		verify(enclosureDao).update(anyObject());
	}
	
	@Test
	public void getEnclosuresTest() {
		@SuppressWarnings("unchecked")
		List<Enclosure> enclosures = mock(List.class);
		
		when(enclosureDao.getAllEnclosures()).thenReturn(enclosures);
		
		enclosureService.getEnclosures();
		verify(enclosureDao).getAllEnclosures();
	}
	
	@Test
	public void getByEnclosureIdTest() throws InvalidInputException {
		when(enclosureDao.getByEnclosureId(anyInt())).thenReturn(enclosure);
		
		enclosureService.getByEnclosureId(anyInt());
		verify(enclosureDao).getByEnclosureId(anyInt());
	}
	
	@Test
	public void deleteEnclosureTest() {
		enclosureService.deleteEnclosure(anyInt());
		verify(enclosureDao).deleteEnclosure(anyInt());
	}

}
