package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int outcome = 1;
        for (int i = 1; i <= power; i++) {
            outcome *= numberToPrint;
        }
        System.out.println(outcome);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
