package Chapter_11.Exercise_06;

import Chapter_10.Circle2D;

import java.util.ArrayList;
import java.util.Date;

public class UseArrayList {

    public static void main(String[] args) {


        ArrayList<Object> list = new ArrayList<>();
        list.add(new Date());
        list.add(new Circle2D());
        list.add(new String("vesek"));


        for (int i = 0; i < list.size() ; i++) {
            System.out.println((list.get(i)).toString());
        }

    }



}