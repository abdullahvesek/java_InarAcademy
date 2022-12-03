package Chapter_13.Exercise_16;

public class Test_16 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("must be 1 !! ");
            System.exit(0);
        }

        String s = args[0];

        String[] str = args[0].replaceAll(" ", "/").split("/");

        Rational r1 = new Rational(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
        Rational r2 = new Rational(Integer.parseInt(str[3]), Integer.parseInt(str[4]));

        switch (args[2].charAt(0)) {
            case '+':
                s += " = " + r1.add(r2);
                break;
            case '-':
                s += " = " + r1.subtract(r2);
                break;
            case '.':
                s += " = " + r1.multiply(r2);
                break;
            case '/':
                s += " = " + r1.divide(r2);
                break;
            default:
                System.out.println("Illegal Argument: + - . /");
                System.exit(0);
        }


        System.out.println(s);

    }
}
