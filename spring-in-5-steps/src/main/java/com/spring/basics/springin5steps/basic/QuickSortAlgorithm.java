package com.spring.basics.springin5steps.basic;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		System.out.println("Quick Sort");
		Arrays.sort(numbers);
		return numbers;
	}

}
