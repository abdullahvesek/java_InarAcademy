package Chapter_12.Exercise_10;

public class OutOfMemory {
    public static void main(String[] args) {

        int length = 1200000000;
        try {
            char[] array = new char[length];
        }
        catch (OutOfMemoryError ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Error handled program continues... ");
    }
}
