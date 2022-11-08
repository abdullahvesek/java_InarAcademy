package Chapter_10;

public class MyStringBuilder2 {
    private String s;
    private char[]chars;

    public MyStringBuilder2(){
        this.s="";
        this.chars=new char[1];
    }
    public MyStringBuilder2(char[]chars){
        this.chars=new char[chars.length];
        for (int i = 0; i <chars.length ; i++) {
            this.chars[i]=chars[i];
        }
    }
 public MyStringBuilder2(String s){
        this.s=s;

 }
public MyStringBuilder2 insert(int offset,MyStringBuilder2 s){
        String result="";
    for (int i = 0; i <offset ; i++) {
        result+=this.s.charAt(i);
    }
result=result+s;
    for (int i = offset; i <this.s.length() ; i++) {
        result+=this.s.charAt(i);
    }

    return new MyStringBuilder2(result);
    }
public MyStringBuilder2 reverse(){
        String result="";
    for (int i = this.s.length()-1; i>=0 ; i--) {
        result+=s.charAt(i);
    }

    return new MyStringBuilder2(result);

    }

public MyStringBuilder2 substring(int begin){
        String result="";
    for (int i = begin; i <s.length() ; i++) {
        result+=s.charAt(i);
    }
return new MyStringBuilder2(result);
    }
public MyStringBuilder2 toUpperCase(){
    String result = "";
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
            result += (char)(s.charAt(i) - 32) + "";
        else
            result += s.charAt(i) + "";
    }
    return new MyStringBuilder2(result);
}


}
