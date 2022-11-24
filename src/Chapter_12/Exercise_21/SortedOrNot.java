package Chapter_12.Exercise_21;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class SortedOrNot {
    public static void main(String[] args) throws Exception {

        File file=new File("SortedStrings.txt");

       if (!file.exists()){
           System.out.println("there is not file ");
       }

        ArrayList<String>list=new ArrayList<>();

        try(
                Scanner input=new Scanner(file);
                ){
            while (input.hasNext()){
                String s=input.next();
                list.add(s);
            }
        }

    if (isSorted(list)){
        System.out.println("the list sorted");
    }
     else{
         printFirstTwo(list);
    }

    }

    private static void printFirstTwo(ArrayList<String> list) {
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).compareTo(list.get(i+1))<0){
                System.out.println(list.get(i));
                System.out.println(list.get(i+1));
            }
        }
    }

    private static boolean isSorted(ArrayList<String> list) {
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).compareTo(list.get(i+1))<0){
             return false;
            }
        }

    return true;
    }


}
