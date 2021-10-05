package com.spring.basics.springin5steps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;

import com.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.spring.basics.springin5steps.basics.properties.SomeExternalService;

@Configuration
@ComponentScan
//app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {
	
//	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsApplication.class);

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class);

		SomeExternalService someExternalService = context.getBean(SomeExternalService.class);
//		BinarySearchImpl binarySearchImpl2 = context.getBean(BinarySearchImpl.class);
		System.out.println(someExternalService.returnServiceURL());
//		System.out.println(binarySearchImpl2);

//		int result = binarySearchImpl.binarySearch(new int[] { 12, 4, 6 }, 12);
//		System.out.println(result);
		
		
//		PersonDAO personDAO = context.getBean(PersonDAO.class);
//		PersonDAO personDAO2 = context.getBean(PersonDAO.class);
//		
//		LOGGER.info("{}",personDAO);
//		LOGGER.info("{}",personDAO.getJdbc());
//		LOGGER.info("{}",personDAO.getJdbc());
//		
//		
//		LOGGER.info("{}",personDAO2);
//		LOGGER.info("{}",personDAO2.getJdbc());
		
		
//		SomeCdiBuisness someCdiBuisness = context.getBean(SomeCdiBuisness.class);
//		LOGGER.info("{}" , someCdiBuisness);
		
		((AbstractApplicationContext) context).close();
	}

}
