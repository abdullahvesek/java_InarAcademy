package Chapter_12.Exercise_09;

public class BinaryFormatExeption extends Exception{
    private String s;
    public BinaryFormatExeption(String s){
        super("this format cannot convert "+s );
        this.s=s;
    }
}
