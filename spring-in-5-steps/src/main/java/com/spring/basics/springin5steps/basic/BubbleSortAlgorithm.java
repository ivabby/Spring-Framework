package com.spring.basics.springin5steps.basic;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		System.out.println("Bubble Sort");
		Arrays.sort(numbers);
		return numbers;
	}

}
