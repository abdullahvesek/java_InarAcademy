package Weeks.week_15;

public class Calculater {

    private static Number result;


    public Calculater(Number result) {

        this.result = result;
    }

    public Calculater() {
        this(new Number());
    }

    public Number getResult() {
        return result;
    }

    public void setResult(Number result) {
        this.result = result;
    }

    public static Number sum(Number n1, Number n2) {
        result = new Number(n1.getValue() + n2.getValue());
        return result;
    }

    public static Number extract(Number n1, Number n2) {
        result = new Number(n1.getValue() - n2.getValue());
        return result;
    }

    public static Number divide(Number n1, Number n2) {
        return new Number(n1.getValue() / n2.getValue());
    }

    public static Number multiply(Number n1, Number n2) {
        result = new Number(n1.getValue() * n2.getValue());
        return result;
    }

    public static Number change(Number n1) {

        result = new Number(n1.getValue() * -1);
        return result;
    }

    public static Number mod(Number n1, Number n2) {
        result = new Number(n1.getValue() % n2.getValue());
        return result;
    }

    public static Number reset() {
        result = new Number();
        return result;
    }


}
