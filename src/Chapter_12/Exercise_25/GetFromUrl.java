package Chapter_12.Exercise_25;

import java.net.MalformedURLException;
import java.util.*;
import java.net.URL;
import java.util.Scanner;

public class GetFromUrl {
    public static void main(String[] args) throws Exception {
        ArrayList<Double> assistant = new ArrayList<>();
        ArrayList<Double> associate = new ArrayList<>();
        ArrayList<Double> full = new ArrayList<>();

        try {

            URL url = new URL("http:// liveexample.pearsoncmg.com/data/Salary.txt ");

            try (
                    Scanner input = new Scanner(url.openStream());
            ) {


                while (input.hasNext()) {
                    String s = input.next();
                    String S2 = input.next();
                    String statu = input.next();
                    double sal = input.nextInt();
                    getSal(assistant, associate, full, statu, sal);

                }
            }

        } catch (MalformedURLException ex) {
            System.out.println("bad url ");
        }

        System.out.println("the average of asistan is " + (sum(assistant) / assistant.size()));
        System.out.println("the average of associate is " + (sum(associate) / associate.size()));
        System.out.println("the average of full is " + (sum(full) / full.size()));


    }

    private static double sum(ArrayList<Double> a) {
        double s = 0;

        for (int i = 0; i < a.size(); i++) {
            s += a.get(i);

        }
        return s;
    }

    private static void getSal(ArrayList<Double> assistant, ArrayList<Double> associate, ArrayList<Double> full, String statu, double sal) {

        if (statu.equals("assistant")) {
            assistant.add(sal);
        } else if (statu.equals("associate"))
            associate.add(sal);
        else if (statu.equals("full"))
            full.add(sal);
    }


}






