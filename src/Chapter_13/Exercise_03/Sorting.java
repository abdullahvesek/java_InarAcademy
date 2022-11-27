package Chapter_13.Exercise_03;

import java.util.ArrayList;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            list.add((int) (Math.random() * 99));
        }

        System.out.println("the list is ");
        System.out.println(list.toString());

        System.out.println("the sorted list is ");
        sort(list);
        System.out.println(list.toString());
    }


    public static void sort(ArrayList<Number> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            Number min = list.get(i);
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).doubleValue() < min.doubleValue()) {
                    min = list.get(j);
                    minIndex = j;

                }
            }

            if (minIndex != i) {
                list.set(minIndex, list.get(i));
                list.set(i, min);
            }

        }

    }
}
