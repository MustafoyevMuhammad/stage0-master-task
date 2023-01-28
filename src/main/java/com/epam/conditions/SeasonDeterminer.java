package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if(1 <= monthNumber && monthNumber <= 2 || monthNumber == 12)
            System.out.println("Winter");
        else if(3 <= monthNumber && monthNumber <= 5)
            System.out.println("Spring");
        else if (6 <= monthNumber && monthNumber <= 8)
            System.out.println("Summer");
        else if(9 <= monthNumber && monthNumber <= 11)
            System.out.println("Autumn");
        else
            System.out.println("Wrong month number");
    }

}
