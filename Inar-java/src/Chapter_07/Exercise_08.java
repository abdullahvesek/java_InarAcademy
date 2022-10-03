package Chapter_07;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        double[]list=new double[10];
        Scanner input=new Scanner(System.in);
        System.out.println("enter 10 double value");
        for (int i = 0; i <10 ; i++) {
            double a= input.nextDouble();
            list[i]=a;

        }
        System.out.println("the average is "+average(list));

    }

    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
    int average=sum/ array.length;
        return average;


    }


    public static double average(double[] array){
       double sum=0;

        for (int i = 0; i < array.length ; i++) {
            sum+=array[i];

        }
   double average=sum/ array.length;
        return average;




    }



}
