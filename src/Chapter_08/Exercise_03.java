package Chapter_08;

public class Exercise_03 {
    public static void main(String[] args) {

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

         char[]key={'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};


         int[][]counts=new int[answers.length][2];

        for (int i = 0; i < answers.length ; i++) {
            int correct=0;
            for (int j = 0; j <answers[i].length ; j++) {
                if (answers[i][j] == key[j]) {
                    counts[i][0] = i;
                    counts[i][1]++;


                }

            }

        }


  sort(counts);

        for (int i = 0; i <counts.length ; i++) {
            System.out.println("the student "+counts[i][0]+" 's correbt answers are "+counts[i][1]);
        }
    }

    public static void sort(int[][]matrix){
        for (int i = 0; i < matrix.length ; i++) {
            int mincol1=matrix[i][0];
            int mincol2=matrix[i][1];
            int minindex=i;

            for (int j = i+1; j < matrix.length ; j++) {
             if (mincol2>matrix[j][1]){
                 mincol1=matrix[j][0];
                 mincol2=matrix[j][1];
                 minindex=j;
             }
            }
       if (minindex!=i){
           matrix[minindex][1]=matrix[i][1];
           matrix[minindex][0]=matrix[i][0];
           matrix[i][1]=mincol2;
           matrix[i][0]=mincol1;
       }




        }
    }


}
