package com.unixlover.springIn5Steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int number) {

        // Implement the sorting logic
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println("Algorithm used : " + sortAlgorithm);

        // search for the number

        return number;
    }
}
