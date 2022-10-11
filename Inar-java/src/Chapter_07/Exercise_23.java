package Chapter_07;

public class Exercise_23 {
    public static void main(String[] args) {
        boolean[]lockers=new boolean[100];
        int[]students=new int[100];


        for (int i = 0; i < students.length ; i++) {
            for (int j = i; j < lockers.length ; j+=i) {
                if (lockers[i])
                    lockers[i]=false;
                else
                    lockers[i]=true;
            }
        }

        for (int i = 0; i < lockers.length ; i++) {
            if (lockers[i])
                System.out.print(i+" ");
        }



    }
}
