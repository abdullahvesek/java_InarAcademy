package Chapter_11.Exercise_07;

import java.util.ArrayList;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        System.out.println("the shuffled list is ");

      shuffle(list);

        for (int i:list)
            System.out.print(i+" ");

    }

    public static void shuffle(ArrayList<Integer> list){

        java.util.Collections.shuffle(list);
    }

}
