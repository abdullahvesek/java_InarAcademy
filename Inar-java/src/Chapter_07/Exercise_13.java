package Chapter_07;

public class Exercise_13 {
    public static void main(String[] args) {



    }
    public static int getRandom(int... numbers) {
        int num;
        boolean isExcluded;
        do {
            isExcluded = false;
            num = 1 + (int)(Math.random() * 54);
            for (int e: numbers) {
                if (num == e)
                    isExcluded = true;
            }
        } while (isExcluded);
        return num;
    }





}
