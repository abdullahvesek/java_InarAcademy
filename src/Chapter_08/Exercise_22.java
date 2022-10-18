package Chapter_08;

public class Exercise_22 {
    public static void main(String[] args) {
        int[][]matrix=new int[6][6];

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j]=(int) (Math.random()*2);
            }
        }

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("the every row is "+(isEvenR(matrix)?"even number of 1 s":" not even number of 1 s"));
        System.out.println("the every col is "+(isEvenC(matrix)?"even number of 1 s":" not even number of 1 s"));


    }
public static boolean isEvenR(int[][]matrix) {
    for (int i = 0; i < matrix.length; i++) {
        int count = 0;
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] == 1)
                count++;
        }
        if (count % 2 != 0)
            return false;
    }

    return true;

}

public static boolean isEvenC(int[][]matrix){
    for (int i = 0; i < matrix[i].length; i++) {
        int count = 0;
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[j][i] == 1)
                count++;
        }
        if (count % 2 != 0)
            return false;
    }

    return true;
}




}
