package Chapter_11.Exercise_13;



import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDublicates {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 10 number ");
        ArrayList<Integer>list=new ArrayList<>();
       ArrayList<Integer>result=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(input.nextInt());
        }

   removeDuplicate(list,result);
        System.out.println("the distinct numbers are ");
        System.out.println(result.toString());

    }

    private static void removeDuplicate(ArrayList<Integer> list,ArrayList<Integer>result) {

        result.add(list.get(0));
        for (int i =1 ; i < list.size() ; i++) {
            if (!(result.contains(list.get(i))))
                result.add(list.get(i));
        }

    }
}
