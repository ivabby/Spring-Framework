package com.mockito.mockitodemo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class SomeBuisnessMockTest {

	// Using Mockito
	// More Effeicient Way
	@Test
	public void testFindTheGreatestFromAllData() {

		DataService dataServiceMock = mock(DataService.class);
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {12,34,10});
		
		SomeBuisnessImpl buisnessImpl = new SomeBuisnessImpl(dataServiceMock);
		int result = buisnessImpl.findTheGreatestFromAllData();
		assertEquals(result , 34);
		
	}
	
	@Test
	public void testFindTheGreatestFromOneValue() {
		
		DataService dataServiceMock = mock(DataService.class);
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {34});
		
		SomeBuisnessImpl buisnessImpl = new SomeBuisnessImpl(dataServiceMock);
		int result = buisnessImpl.findTheGreatestFromAllData();
		assertEquals(result , 34);
		
	}

}