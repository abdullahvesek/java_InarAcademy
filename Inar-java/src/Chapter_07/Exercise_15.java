package Chapter_07;

import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 10 integer: ");
    int[]list=new int[10];
    int[]count=new int[10];

        for (int i = 0; i < list.length ; i++) {
            list[i]=input.nextInt();
            count[list[i]]++;

        }

        System.out.println("the nondublicate elemnts are: \n");

        for (int i = 0; i < count.length ; i++) {
            if (count[i]==1)
                System.out.print(i+" ");
            }
        System.out.println();

    }

    }

