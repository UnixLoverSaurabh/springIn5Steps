package com.unixlover.springIn5Steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgorithm());
		int result = binarySearchImpl.binarySearch(new int[] {12, 5, 8}, 5);

		System.out.println("Result is : " + result);

		// SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
