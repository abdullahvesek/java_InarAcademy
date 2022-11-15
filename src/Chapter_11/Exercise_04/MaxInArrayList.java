package Chapter_11.Exercise_04;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxInArrayList {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      int value=1;

     ArrayList<Integer>list=new ArrayList<>();
        System.out.println("enter list");

      while (value!=0){
          value= input.nextInt();
          list.add(value);
      }

        System.out.println("the largest number is  "+max(list));

    }

    public static Integer max(ArrayList<Integer> list){
        if (list.size()==0  || list.isEmpty()){
            return null;
        }
     int max=0;
        for (int i:list){
            if (i>max){
                max=i;
            }
        }
       return max;
    }


}
