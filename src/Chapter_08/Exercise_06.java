package Chapter_08;

import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 3 x 3 matrix ");
        double[][]m1=new double[3][3];
        for (int i = 0; i < m1.length ; i++) {
            for (int j = 0; j <m1[i].length ; j++) {
                m1[i][j]=input.nextDouble();
            }
        }


        System.out.println("enter the other 3 x 3 matirx");
        double[][]m2=new double[3][3];

        for (int i = 0; i < m2.length ; i++) {
            for (int j = 0; j <m2[i].length ; j++) {
                m2[i][j]=input.nextDouble();
            }
        }

    double[][]s=multiplyMatrix(m1,m2);
        for (int i = 0; i <s.length ; i++) {
            for (int j = 0; j <s[i].length ; j++) {
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static double[][]
    multiplyMatrix(double[][] a, double[][] b){
        double[][]s=new double[3][3];
        for (int i = 0; i <s.length ; i++) {
            for (int j = 0; j <s[i].length ; j++) {
                for (int k = 0; k < s.length ; k++) {
                    s[i][j]+=a[i][k]*b[k][i];
                }
            }
        }

        return s;


    }



}
