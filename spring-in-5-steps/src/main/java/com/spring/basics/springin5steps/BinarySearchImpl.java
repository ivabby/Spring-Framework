package com.spring.basics.springin5steps;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	SortAlgorithm sortingAlgorithm;

	public int binarySearch(int[] numbers, int number) {

		numbers = sortingAlgorithm.sort(numbers);

		int low = 0, high = numbers.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (numbers[mid] == number) {
				return mid;
			} else if (numbers[mid] < number) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}

}
