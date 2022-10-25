package Chapter_09;

import java.util.Random;

public class Randomm {
    public static void main(String[] args) {
        Random generator=new Random(1000);
        for (int i = 1; i <51 ; i++) {
           if (i%10!=0)
            System.out.print(generator.nextInt(100)+" ");
            else
               System.out.println(generator.nextInt(100));
        }
    }
}
