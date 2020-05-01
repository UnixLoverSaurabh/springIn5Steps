package com.unixlover.springIn5Steps;

public class BinarySearchImpl {

    SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int number) {

        // Implement the sorting logic
        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        // search for the number

        return number;
    }
}
