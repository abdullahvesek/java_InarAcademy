package Chapter_11.Exercise_18;

import java.util.ArrayList;

public class ReturningCh {
    public static void main(String[] args) {
        String s="abc";
        ArrayList<Character>list= toCharacterArray(s);
        System.out.println(list.toString());

    }

    public static ArrayList<Character> toCharacterArray(String s){
      ArrayList<Character>ch=new ArrayList<>();

        for (int i = 0; i <s.length() ; i++) {
            ch.add(s.charAt(i));
        }

        return ch;
    }
}
