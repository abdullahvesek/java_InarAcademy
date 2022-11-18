package Chapter_12.Exercise_01;

public class Calculater2 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("must be length 3 ");
            System.exit(2);
        }

        test(args[0]);
        test(args[2]);

        int result = 0;

        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '.':
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }

    private static void test(String arg) {
        for (int i = 0; i < arg.length(); i++) {
            if (!(Character.isDigit(arg.charAt(i)))) {
                System.out.println("wrong input body!! ");
                System.exit(3);
            }
        }
    }


}
