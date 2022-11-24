package Chapter_12.Exercise_19;

import java.io.FileNotFoundException;
import java.net.*;
import java.util.Scanner;

public class ReadWeb {
    public static void main(String[] args) throws Exception{


        int word=0;

        try{
            URL url=new URL(" https://liveexample.pearsoncmg.com/data/Lincoln.txt.");
                Scanner input=new Scanner(url.openStream());

            while (input.hasNext()){
                String s=input.next();
                word++;
            }
        }catch (MalformedURLException ex ){
            System.out.println("ınvalid url");
        }
        catch (FileNotFoundException e){
            System.out.println("there is no file ");
        }

        System.out.println("the number of words is "+word);
    }
}
