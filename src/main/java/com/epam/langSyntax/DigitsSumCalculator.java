package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int summ = 0;
        for (int i = 0;number > 0; i++) {
            summ += number % 10;
            number /= 10;
        }
        number = summ;
        System.out.println(summ);
    }

}
