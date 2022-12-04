package Weeks.week_17;
import java.util.*;
public class Ders {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(((int) (Math.random() * 20)));
        }
        System.out.println(list.toString());
        System.out.println(min(list));
        System.out.println(indexOfSmallest(list));
       showUni(list);

    }

    public static Integer min(List list) {
        int min = (int) list.get(0);
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if ((int) list.get(i) < min) {
                min = (int) list.get(i);
                index = i;

            }
        }
        return (int) list.get(index);

    }

    public static int indexOfSmallest(List list) {
        int min = (int) list.get(0);
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if ((int) list.get(i) < min) {
                min = (int) list.get(i);
                index = i;

            }
        }
        return index;
    }

public static void showUni(List list){

        Set<Integer>set=new HashSet<>();

    for (int i = 0; i <list.size() ; i++) {
        set.add((int)list.get(i));
    }

    System.out.println(Arrays.toString(set.toArray()));
    }


}