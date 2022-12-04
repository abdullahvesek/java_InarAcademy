package Chapter_mixed;

import java.util.*;

public class Exercise7_6 {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();
        int number = 2;
        int count = 0;
        while (count <= 50) {
            if (isPrime(number)) {
                list.add(number);
                count++;
            }
            number++;
        }

        System.out.println(Arrays.toString(list.toArray()));
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }

        }
return true;
    }
}