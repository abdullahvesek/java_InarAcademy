package Chapter_11.Exercise_15;

import java.util.ArrayList;
import java.util.Scanner;

public class AreaOfConvex {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of points ");
        int number= input.nextInt();
        ArrayList<Double>list=new ArrayList<>();
        for (int i = 0; i <number*2 ; i++) {
            list.add(input.nextDouble());
        }

        System.out.println("The area of poligon is "+getArea(list));

    }

    private static double getArea(ArrayList<Double> list) {
       double first=0;
        for (int i = 0,j=3; i <= list.size()-4 ; i+=2,j+=2) {
 first+=(list.get(i).intValue())*(list.get(j).intValue());
        }
 first=first+(list.get(list.size()-2).intValue())*(list.get(1).intValue());

   double second=0;
        for (int i = 1,j=2; i <= list.size()-3 ; i+=2,j+=2) {
            second+= (list.get(i).intValue())* (list.get(j).intValue());
        }
    second=second+( list.get(list.size()-1).intValue())* (list.get(0).intValue());
    return (1/2)*(first-second);
    }
}
