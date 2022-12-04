package Chapter_mixed;

import java.util.*;

public class Exercise11_14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 5 int for list 1");
        ArrayList<Integer>list1=new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            list1.add(input.nextInt());
        }
        System.out.println("enter 5 int for list 2");
        ArrayList<Integer>list2=new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            list2.add(input.nextInt());
        }
        Set<Integer>list=new HashSet<>();
        list.addAll(list1);
        list.addAll(list2);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
