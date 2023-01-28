package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int number2 = 0;
        int cycle = 3;
        while(cycle > 0){
            number2 += number%10;
            number = number/10;
            number2 *= cycle-- > 1?10:1;
        }
        number = number2;
        System.out.println(number2);
    }


}
