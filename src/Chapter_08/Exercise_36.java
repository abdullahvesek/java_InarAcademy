package Chapter_08;
     import java.util.Scanner;
public class Exercise_36 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of n:");
       int n=input.nextInt();

       char[][]list=new char[n][n];
        System.out.println("enter list");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
               String s=input.next();
               char c=s.charAt(0);
               if (c>='A'&& c<(char) ('A'+n))
                   list[i][j]=c;
               else
                   System.out.println("wrong input:");

            }
        }
        System.out.println("the list is "+(isLatin(list)?" latin":" not latin"));

    }

public static boolean isDistintcR(char[][]c){
        int[]count=new int[c.length];



    for (int i = 0; i <c.length ; i++) {
        for (int j = 0; j <c[i].length ; j++) {
            count[(c[i][j]-65)]++;
            if (count[(c[i][j]-65)]>1)
                return false;
        }
    }

    return true;

    }
    public static boolean isDistintcC(char[][]c){
        int[]count=new int[c.length];



        for (int i = 0; i <c[i].length ; i++) {
            for (int j = 0; j <c.length ; j++) {
                count[(c[j][i]-65)]++;
                if (count[(c[j][i]-65)]>1)
                    return false;
            }
        }

        return true;

    }

public static boolean isLatin(char[][]list){
        if (isDistintcC(list)&&isDistintcR(list))
            return true;
        else
            return false;


    }

}
