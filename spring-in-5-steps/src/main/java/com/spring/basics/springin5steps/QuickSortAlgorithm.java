package com.spring.basics.springin5steps;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm{

	public int[] sort(int[] numbers) {
		System.out.println("Quick Sort");
		Arrays.sort(numbers);
		return numbers;
	}
	
}
