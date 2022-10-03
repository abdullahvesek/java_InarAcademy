package Chapter_07;

import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 10 number: ");
        double[]list=new double[10];

        for (int i = 0; i <10 ; i++) {
            int a= input.nextInt();
            list[i]=a;

        }
        System.out.printf("the deviation is: %.2f \n the mean is %.1f",deviation(list),mean(list));


    }
    public static double mean(double[] x){
        int sum=0;
        for (int i = 0; i < x.length ; i++) {
            sum+=x[i];

        }
      double mean=sum/x.length;
        return mean;
    }

    public static double deviation(double[] x){
        double deviation=0;
        for (int i = 0; i <x.length ; i++) {
         deviation+=Math.pow(x[i]-mean(x),2);
        }

   deviation=deviation/(x.length-1);
        deviation=Math.sqrt(deviation);
        return deviation;


    }


}
