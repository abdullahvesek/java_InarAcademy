package Chapter_08;

import java.util.Scanner;

public class Exercise_37 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter firs country and capital city:");
        String[][]list=new String[4][2];
        for (int i = 0; i < list.length ; i++) {
            for (int j = 0; j <list[i].length ; j++) {
              list[i][j]= input.next();

            }
        }
        System.out.println ("the correct answer is " + count(list));

    }


public static int count(String[][]list){
    Scanner input=new Scanner(System.in);
        int count=0;
        for (int i = 0; i < list.length ; i++) {
        System.out.println("what is capital of "+list[i][0]);
        String answer= input.next();
        if (answer.equals(list[i][1])){
            System.out.println("your answer is correct");
            count++;

        }
        else{
            System.out.println("the correct answer should be "+list[i][1]);
        }


    }

    return count;
    }

}
