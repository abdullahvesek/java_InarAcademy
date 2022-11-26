package Chapter_12.Exercise_31;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class NameRank {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        String year = input.nextLine();

        System.out.print("Enter the gender: ");
        String gender = input.nextLine();

        System.out.print("Enter the name: ");
        String name = input.nextLine();


        ArrayList<String> list = new ArrayList<>();

        try {

            URL url = new URL("http://www.cs.armstrong.edu/liang/data/babynamesranking" + year + ".txt");

            Scanner inp = new Scanner(url.openStream());

            while (inp.hasNext()) {
                for (int i = 0; i < 5; i++) {
                    list.add(i, inp.next());
                }
            }

            if (list.get(genders(gender)).equals(name)) {
                System.out.println(name + " is ranked #" + list.get(0) + " in year " + year);
                System.exit(0);
            }
            list.clear();

        } catch (MalformedURLException ex) {
            System.out.println("url is wrong ");
        } catch (IOException ex) {
            System.out.println("wrong ");
        }
        System.out.println("The name " + name + " is not ranked in year " + year);

    }

    private static int genders(String gender) {
        if (gender.equals("M")) {
            return 1;
        }
        return 3;
    }


}