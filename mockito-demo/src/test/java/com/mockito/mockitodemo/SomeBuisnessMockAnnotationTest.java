package com.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SomeBuisnessMockAnnotationTest {

	@Mock
	DataService dataServiceMock;

	@InjectMocks
	SomeBuisnessImpl buisnessImpl;

	// Using Mockito
	// More Effeicient Way
	@Test
	public void testFindTheGreatestFromAllData() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 12, 34, 10 });
		int result = buisnessImpl.findTheGreatestFromAllData();
		assertEquals(result, 34);

	}

	@Test
	public void testFindTheGreatestFromOneValue() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 34 });
		int result = buisnessImpl.findTheGreatestFromAllData();
		assertEquals(result, 34);

	}

	@Test
	public void testFindTheGreatestFromNoValue() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { });
		int result = buisnessImpl.findTheGreatestFromAllData();
		assertEquals(result, Integer.MIN_VALUE);
		
	}

}