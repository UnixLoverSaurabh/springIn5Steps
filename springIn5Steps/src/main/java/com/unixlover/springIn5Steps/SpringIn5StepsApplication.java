package com.unixlover.springIn5Steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	// What are the beans ?						@Component		Application context manages all the beans.
	// What are the dependencies of a bean?
	// Where to search for beans?				@SpringBootApplication 		component scan in particular package using spring boot

	public static void main(String[] args) {

		// BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgorithm());

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearchImpl.binarySearch(new int[] {12, 5, 8}, 5);

		System.out.println("Result is : " + result);
	}

}
