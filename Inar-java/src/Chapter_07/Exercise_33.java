package Chapter_07;

import java.util.Scanner;

public class Exercise_33 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter a year:  ");
        int year= input.nextInt();


        String[]years={"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger",
                "rabbit", "dragon", "snake", "horse", "sheep"};


        System.out.println("the year is : "+ years[year%12]);

    }
}
