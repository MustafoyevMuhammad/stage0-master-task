package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        cathetusLength = cathetusLength + 1;
        for (int j = 1; j < cathetusLength; j++) {
            for (int i = 1; i < cathetusLength - j; i++) {
                System.out.print(" ");
            }
            int  k = j;
            while (k != 1){
                System.out.print("*");
                --k;
            }
            System.out.print("*");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
