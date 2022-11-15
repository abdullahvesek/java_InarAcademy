package Chapter_11.Exercise_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("enter  numbers ");
         int number= input.nextInt();
      while (number!=0){

          list.add(number);
          number= input.nextInt();
      }
   int result=0;
      for (int i:list)
          result+=i;

        System.out.println("the sum is "+result);
    }
}
