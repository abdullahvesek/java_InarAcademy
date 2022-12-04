package Chapter_mixed;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise7_4 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println( "enter scores negative ends input");
        double average=0;
        int total=0;
        int score=0;
        while (score>=0){
            score=input.nextInt();
            list.add(score);
            total+=score;
        }

    average=total/list.size();

      int under=0;
      int over=0;

        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i)<average){
                under++;
            }
            else
                over++;
        }

        System.out.println("the average is "+average+"\n the sum is "+total+"\n under average is "+under+" \n over is "+over);

    }
}
