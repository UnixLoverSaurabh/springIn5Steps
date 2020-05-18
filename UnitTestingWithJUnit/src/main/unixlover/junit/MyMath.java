package main.unixlover.junit;

public class MyMath {

    int sum(int[] numbers) {
        int summ = 0;
        for(int i : numbers) {
            summ += i;
        }
        return summ;
    }

    public static void main(String[] args) {
        System.out.println("Hi there");
    }
}