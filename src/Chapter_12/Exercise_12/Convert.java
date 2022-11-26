package Chapter_12.Exercise_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) throws Exception {

        ArrayList<String>list=new ArrayList<>();
        String s1="";
        String s2="";


        if (args.length != 1) {
            System.out.println("Usage: java Exercise_12_12 file");
            System.exit(1);
        }


        File file = new File(args[0]);


        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }

        try(
                Scanner input=new Scanner(file);
                ){

            s1= input.nextLine();
            while (input.hasNext()){
                s2=input.nextLine();
                if (s2.length()>0 && s2.charAt(s2.length()-1)=='{'){
                    list.add(s1.concat("{"));
                  s1= input.nextLine();

                }

                else{
                    list.add(s1);
                    s1=s2;
                }

            }

       list.add(s1);
        }

        try (

                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < list.size(); i++) {
                output.println(list.get(i));
            }
        }


    }
}
