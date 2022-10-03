package Chapter_07;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 10 number: ");
        double []list=new double[10];

        for (int i = 0; i <10 ; i++) {
            double a= input.nextDouble();
            list[i]=a;

        }
        System.out.println("the smallest is  "+min(list));

    }

    public static double min(double[] array){
        double min=array[0];
        for (int i = 1; i < array.length ; i++) {
            if(array[i]<min)
                min=array[i];
        }
   return min;
    }

}
