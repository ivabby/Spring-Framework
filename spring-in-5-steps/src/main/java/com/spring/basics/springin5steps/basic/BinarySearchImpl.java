package com.spring.basics.springin5steps.basic;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope(scopeName = "prototype")
public class BinarySearchImpl {
	
//	private Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);

	@Autowired
	@Qualifier("bubble")
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

	
//	@PostConstruct
//	public void postConstruct() {
//		logger.info("Inside Post Construct");
//	}
//	
//	@PreDestroy
//	public void preDestroy() {
//		logger.info("Inside Pre Destroy");
//	}
}
