package Chapter_13.Exercise_02;

import java.util.ArrayList;

public class Shuffle {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            list.add((int) (Math.random() * 99));
        }

        System.out.println("the list is ");
        System.out.println(list.toString());

        System.out.println("the shuffled list is ");
        shuffle(list);
        System.out.println(list.toString());
    }


    public static void shuffle(ArrayList<Number> list) {
        java.util.Collections.shuffle(list);


    }


}
