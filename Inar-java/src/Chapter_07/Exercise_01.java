package Chapter_07;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of students:  ");
        int [] scores=new int[input.nextInt()];
        char [] grades=new char[scores.length];


        for (int i = 0; i < scores.length ; i++) {
            scores[i]= input.nextInt();
        }






        max (scores);

        for (int i = 0; i < scores.length ; i++) {
            if (scores[i] >= max(scores)-10) {
                grades[i] = 'A';
            }
            else if(scores[i]>=max(scores)-20)
                    grades[i]='B';
                else
                    grades[i]='C';

            }



        for(int i = 0; i < scores.length; i++) {

        System.out.println("the student "+i+" scored "+scores[i]+" and grade is "+grades[i]);

        }


    }
    public static int max (int[]scores){
        int max=scores[0];
        for (int i = 1; i < scores.length ; i++) {
            if(scores[i]>max)
                max=scores[i];
        }
        return max;

    }



}
