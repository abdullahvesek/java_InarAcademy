package Chapter_mixed;

import java.util.ArrayList;

public class Exercise7_7 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();

       int[]count=new int[10];
        for (int i = 0; i <100 ; i++) {
        int k=    ((int) (Math.random()*10));
        list.add(k);
        count[k]++;

        }

        System.out.println(list.toString());
        System.out.println("-----------------------------------------");
        for (int i = 0; i <10 ; i++) {
            System.out.println("occurences of "+i+" is "+count[i]);
            System.out.println("----------------------------");
        }
    }
}
