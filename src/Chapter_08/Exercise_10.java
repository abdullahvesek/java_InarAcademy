package Chapter_08;

public class Exercise_10 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        Exercise_16.print(matrix);


        int index1 = 0;
        int count1 = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 1)
                count1++;
        }

        for (int i = 1; i < matrix.length; i++) {
            int count2 = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1)
                    count2++;
            }
            if (count2 > count1) {
                index1 = i;
            }
        }
        System.out.println("the largest row is " + index1);


    }
}

