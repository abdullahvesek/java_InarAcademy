package Chapter_07;

import java.util.Scanner;

public class Exercise_20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 10 double number: ");
        double []list=new double[10];
        for (int i = 0; i < list.length; i++) {
            list[i]=input.nextInt();
        }

    sort(list);

for (double e:list)
    System.out.print(e+" ");
        System.out.println();


    }

public static void sort(double[]list){
       for (int i= list.length-1;i>=0;i--){
           double max=list[i];
           int maxIndex=i;

           for (int j = i-1; j >=0 ; j--) {
               if (list[j]>max){
                   max=list[j];
                   maxIndex=j;
               }

           }
      if(maxIndex!=i){
          list[maxIndex]=list[i];
          list[i]=max;
      }



       }

    }




}
