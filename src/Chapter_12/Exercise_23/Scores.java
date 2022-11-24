package Chapter_12.Exercise_23;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Scores {
    public static void main(String[] args) throws Exception {

        URL url = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt ");


        double total = 0;
        int count = 0;

        try {


            try (
                    Scanner input = new Scanner(url.openStream());
            ) {
                while (input.hasNext()) {
                    int a = input.nextInt();
                    total += a;
                    count++;
                }
            }


        } catch (MalformedURLException ex) {
            System.out.println("the url is bad!!!");
        }


        System.out.println("the total is " + total);
        System.out.println("the average is " + (total / count));


    }
}