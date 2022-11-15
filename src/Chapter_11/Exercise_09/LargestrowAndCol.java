package Chapter_11.Exercise_09;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;

public class LargestrowAndCol {
    public static void main(String[] args) {
        int[][]list=new int[4][4];
        fill(list);

        show(list);

        ArrayList<Integer>result=new ArrayList<>();
        result.add(largestRow(list));
        result.add(largestCol(list));

        System.out.println("the largest row is "+result.get(0));
        System.out.println("the largest col is "+result.get(1));

    }

    private static void show(int[][] list) {
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print(list[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static Integer largestRow(int[][] list) {
        int max=0;
        Integer b=0;
        for (int i = 0; i <4 ; i++) {
           int count=0;
            for (int j = 0; j <4 ; j++) {
                if (list[i][j]==1)
                    count++;
            }
        if (count>max) {
            max=count;
            b = i;
        }
        }
     return b;
    }

    private static Integer largestCol(int[][] list) {
        int max=0;
        Integer b=0;
        for (int i = 0; i <4 ; i++) {
            int count=0;
            for (int j = 0; j <4 ; j++) {
                if (list[j][i]==1)
                    count++;
            }
            if (count>max) {
               max=count;
                b = i;
            }
        }
        return b;
    }



    private static void fill(int[][] list) {
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                list[i][j]=(int)(Math.random()*2);
            }
        }
    }


}
