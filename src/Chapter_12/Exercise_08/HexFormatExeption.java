package Chapter_12.Exercise_08;

public class HexFormatExeption extends Exception{
    private String s;

    public HexFormatExeption(String s){
        super("this format is not good "+ s );
        this.s=s;
    }
}
