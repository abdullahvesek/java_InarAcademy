package Chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of students: ");
        int[]scores=new int[input.nextInt()];
        String[]name=new String[scores.length];

        for (int i = 1; i <=scores.length ; i++) {
            System.out.println("enter student "+i+" name and score:");
            name[i]= input.next();
            scores[i]=input.nextInt();
        }
    int[]scores2=new int[scores.length];
        System.arraycopy(scores,0,scores2,0,scores.length);

  Arrays.sort(scores);

        for (int i = 0; i < scores.length ; i++) {
            for (int j = 0; j <scores2.length ; j++) {
                if(scores[i]==scores2[j])
                    System.out.println(scores2[j]+"   "+name[j]);
            }
        }

    }
}
