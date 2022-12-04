package Chapter_mixed;

import java.util.*;

public class Exercise21_6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter  values 0 ends input ");
        int answer =1;

        Map<Integer,Integer> map=new HashMap<>();


        while (answer!=0){
            answer = input.nextInt();
            if (map.containsKey(answer)){
                int a=  map.get(answer);
                a++;
                map.put(answer,a);
            }
            else {

                map.put(answer, 1);

            }
        }

        int max = Collections.max(map.values());
        System.out.println(max);



    }
}
