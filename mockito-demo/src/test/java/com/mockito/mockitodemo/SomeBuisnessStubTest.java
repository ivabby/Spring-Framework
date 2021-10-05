package com.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SomeBuisnessStubTest {

	// Traditional Way Without Using Mockito
	@Test
	public void testFindTheGreatestFromAllData() {
		SomeBuisnessImpl someBuisnessImpl = new SomeBuisnessImpl(new DataServiceStub());
		int result = someBuisnessImpl.findTheGreatestFromAllData();
		assertEquals(23 , result);
	}

}



class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[]{23,6,15};
	}
	
}