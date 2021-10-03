package com.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
//		BinarySearchImpl binarySearch = new BinarySearchImpl();
		
		// Application Context will maintain all the beans
		ApplicationContext context = SpringApplication.run(SpringIn5StepsApplication.class, args);

		BinarySearchImpl binarySearchImpl = context.getBean(BinarySearchImpl.class);
		
		int result = binarySearchImpl.binarySearch(new int[] {12,4,6}, 12);
		System.out.println(result);
	}

}
