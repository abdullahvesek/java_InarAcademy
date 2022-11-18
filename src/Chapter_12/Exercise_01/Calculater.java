package Chapter_12.Exercise_01;

public class Calculater {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("must be length 3");
            System.exit(2);
        }

        int result = 0;

        try {
            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                    break;
                case '*':
                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                    break;
            }

            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                    + " = " + result);

        } catch (Exception ex) {
            System.out.println("wrong input ");
        }


    }

}
