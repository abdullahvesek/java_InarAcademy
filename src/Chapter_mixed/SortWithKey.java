package Chapter_mixed;

import java.util.*;

public class SortWithKey {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter key and value");

        Map<Integer,Integer>map=new HashMap<>();

        for (int i = 0; i <10 ; i++) {
            map.put(input.nextInt(),input.nextInt());
        }

   List<Integer>list=new ArrayList<>(map.keySet());
        Collections.sort(list);

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i)+"  "+map.get(list.get(i)));
        }



    }
}
