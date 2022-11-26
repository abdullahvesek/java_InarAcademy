package Chapter_12.Exercise_26;

import java.io.File;
import java.util.Scanner;

public class Mkdir {
    public static void main(String[] args) throws Exception{

        Scanner input=new Scanner(System.in);
        System.out.println("enter dir name : ");
        File dir=new File(input.next());

        if (dir.isDirectory()){
            System.out.println("the directory already exist");
            System.exit(0);
        }

    if (dir.mkdirs()){
        System.out.println("created succesfully");
    }

    }
}
