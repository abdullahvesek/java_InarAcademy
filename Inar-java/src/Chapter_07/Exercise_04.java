package Chapter_07;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        int sum = 0;
        int average = 0;
        int numberOf = 0;
        int below=0;
        int over=0;


        Scanner input = new Scanner(System.in);

        int[] notes = new int[100];

        System.out.println("enter scores between 0 and 100");

        for (int i = 0; i <notes.length ; i++) {
            int score= input.nextInt();
            if(score<0)
                break;

            sum+=score;
            numberOf++;
            notes[i]=score;


        }

        average=sum/numberOf;


        for (int i = 0; i <numberOf ; i++) {
            if(notes[i]>=average)
                over++;
            else
                below++;

        }

        System.out.println("the number of over or equal "+over+"\n number of below is "+below);

    }
}