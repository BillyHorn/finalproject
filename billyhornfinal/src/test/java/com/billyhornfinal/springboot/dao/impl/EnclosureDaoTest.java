package com.billyhornfinal.springboot.dao.impl;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Before;
import org.junit.Test;

import com.billyhornfinal.springboot.entities.Enclosure;

public class EnclosureDaoTest {
	
	private EnclosureDaoImpl dao;
	private EntityManager mockEm;
	private Enclosure enclosure;

	@Before
	public void setup() {
		dao = new EnclosureDaoImpl();
		mockEm = mock(EntityManager.class);
		dao.setEm(mockEm);
		enclosure = mock(Enclosure.class);
	}
	
	@Test
	public void addTest(){
		dao.add(null);
		verify(mockEm).persist(null);
	}

	@Test
	public void updateTest() {
		dao.update(null);
		verify(mockEm).merge(null);
	}
	
	@Test
	public void getAllEnclosuresTest() {
		@SuppressWarnings("unchecked")
		TypedQuery<Enclosure> mockTypedQuery = mock(TypedQuery.class);

		List<Enclosure> expected = new ArrayList<Enclosure>();

		when(mockEm.createQuery(anyString(), eq(Enclosure.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.getResultList()).thenReturn(expected);

		dao.getAllEnclosures();

		verify(mockTypedQuery).getResultList();
	}
	
	@Test
	public void getByEnclosureIdTest() {
		@SuppressWarnings("unchecked")
		TypedQuery<Enclosure> mockTypedQuery = mock(TypedQuery.class);

		Enclosure enclosure = new Enclosure();

		when(mockEm.createQuery(anyString(), eq(Enclosure.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.setParameter(anyString(), anyInt())).thenReturn(mockTypedQuery);
		when(mockTypedQuery.getSingleResult()).thenReturn(enclosure);

		dao.getByEnclosureId(1);

		verify(mockTypedQuery).setParameter(eq("enclosureId"), eq(1));
	}
	
	@Test
	public void deleteEnclosureTest() {
		dao.deleteEnclosure(null);
		verify(mockEm).remove(null);
	}

}
