package Chapter_10;

import com.sun.deploy.security.SelectableSecurityManager;

public class MyString2 {
    private String s;

    public MyString2(String s){
        this.s="";
        for (int i = 0; i <s.length() ; i++) {
         this.s+=s.charAt(i);
        }

    }

public int compare(String s) {
    if (this.s.length() > s.length())
        return 1;
    else if (this.s.length() == s.length()) {
        return 0;
    } else
        return -1;


}

public MyString2 substring(int begin){
       String result="";
    for (int i = begin; i <this.s.length() ; i++) {
        result+=s.charAt(i);
    }

    return new MyString2(result);
    }

public MyString2 toUpperCase(){
        String result="";
    for (int i = 0; i <s.length() ; i++) {
        if (s.charAt(i)>='a' && s.charAt(i)<='z')
            result+=(char)(s.charAt(i)-32);
         else
             result+=s.charAt(i);
    }

    return new MyString2(result);

    }
public char[]toChars(){
        char []ch=new char[s.length()];
    for (int i = 0; i <s.length() ; i++) {
        ch[i]=s.charAt(i);
    }

    return ch;
    }
    public static MyString2 valueOf(boolean b) {
        return (b ? new MyString2("true") : new MyString2("false"));
    }

}
