package Chapter_10;

public class MyInteger {
    private int value;
    MyInteger(int value){
        this.value=value;
    }
public int getValue(){
        return value;
}
public boolean isEven(){
        if (getValue()%2==0)
            return true;
        else
            return false;
}
public boolean isOdd(){
    if (getValue()%2==0)
        return false;
    else
        return true;
}
public boolean isPrime(){
    for (int i = 2; i <getValue()/2 ; i++) {
        if (getValue()%i==0)
            return false;
    }
    return true;

    }
    public static boolean isEven(int value){
        if (value%2==0)
            return true;
        else
            return false;
    }
    public static  boolean isOdd(int value){
        if (value%2==0)
            return false;
        else
            return true;
    }
    public static boolean isPrime(int value){
        for (int i = 2; i <value/2 ; i++) {
            if (value%i==0)
                return false;
        }
        return true;

    }

    public static boolean isEven(MyInteger m){
        if (m.getValue()%2==0)
            return true;
        else
            return false;
    }
    public static  boolean isOdd(MyInteger m){
        if (m.getValue()%2==0)
            return false;
        else
            return true;
    }
    public static boolean isPrime(MyInteger m){
        for (int i = 2; i <m.getValue()/2 ; i++) {
            if (m.getValue()/2==0)
                return false;
        }
        return true;

    }
public boolean equals(int value){
        if (getValue()==value)
            return true;
        else
            return false;
}
public boolean equals(MyInteger m){
        if (getValue()==m.getValue())
            return true;
        else
            return false;
}


public static int parseInt(char[]ch){
        String s=String.valueOf(ch);
        Integer z=Integer.parseInt(s);
        return z;

}
public static int parseInt(String a){
        Integer x =Integer.parseInt(a);
        return x;
}

    public static void main(String[] args) {
       MyInteger vesek=new MyInteger(255);
       System.out.println("the value is "+((vesek.isEven())?" even":"not even"));
        System.out.println("the value is "+((vesek.isOdd())?" odd":"not odd"));
        System.out.println("the value is "+((vesek.isPrime())?" prime":"not prime"));




    }
}
