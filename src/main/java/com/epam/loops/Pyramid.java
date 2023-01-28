package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        cathetusLength = cathetusLength +1;
        for (int j = 1; j < cathetusLength; j++) {
            for (int i = 1; i < cathetusLength - j; i++) {
                System.out.print(" ");
            }
            int  k = j;
            while (k != 1){
                System.out.print(k);
                --k;
            }
            System.out.print(1);
            for (int i = 2; i <= j; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}



