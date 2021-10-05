package com.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ListTest {

	@Test
	void testSize() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10);

		assertEquals(listMock.size(), 10);
		assertEquals(listMock.size(), 10);
	}

	@Test
	void testSize_multipleReturns() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10).thenReturn(20);

		assertEquals(listMock.size(), 10);
		assertEquals(listMock.size(), 20);
	}

	@Test
	void testGet() {
		List listMock = mock(List.class);
		// Only 0 index will have string and all other index will have null values
		when(listMock.get(0)).thenReturn("Some String");
		
		assertEquals(listMock.get(0), "Some String");
		assertEquals(listMock.get(1), null);
	}
	
	@Test
	void testGet_GenericParameters() {
		List listMock = mock(List.class);
		
		//	All index will have string 
		when(listMock.get(Mockito.anyInt())).thenReturn("Some String");
		
		assertEquals(listMock.get(0), "Some String");
		assertEquals(listMock.get(1), "Some String");
	}

}
