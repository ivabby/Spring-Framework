package com.spring.basics.springin5steps;

import java.util.Arrays;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{

	public int[] sort(int[] numbers) {
		System.out.println("Bubble Sort");
		Arrays.sort(numbers);
		return numbers;
	}
	
}
