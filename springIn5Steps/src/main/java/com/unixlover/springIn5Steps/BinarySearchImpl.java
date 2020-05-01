package com.unixlover.springIn5Steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

//    Autowiring for the bean is done either using
//            1. Constructor
//            2. Setter
//            3. No Constructor or no setter

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
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
