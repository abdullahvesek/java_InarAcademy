package Chapter_07;

public class Exercise_06 {
    public static void main(String[] args) {
        final int ROW = 10;

        int[] list = new int[50];
        int n = 2;
        int count = 0;

        while (count <= 50) {
            if(isPrime(n)){
                list[count]=n;
                count++;
                n++;
            }
             else
                 n++;


        }


        for (int i = 0; i < list.length; i++) {
            if (i % ROW == 0)
                System.out.println(list[i]);
            else
                System.out.print(list[i] + " ");
        }

    }

    public static boolean isPrime(int x) {
        for (int divisor = 2; divisor <= Math.sqrt(x); divisor++) {
            if (x % divisor == 0)
                return false;
        }
        return true;
    }

}

