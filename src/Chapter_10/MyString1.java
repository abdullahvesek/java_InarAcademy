package Chapter_10;

public class MyString1 {
    private char[]chars;

    MyString1(char[]chars){
        this.chars=new char[chars.length];
        for (int i = 0; i <chars.length ; i++) {
            this.chars[i]=chars[i];
        }
   MyString1 s=new MyString1(this.chars);
    }
public char charAt(int index){
        return this.chars[index];
}
public int length(){
        return this.chars.length;
}
public MyString1 substring(int begin,int end) {
    char[] result = new char[end - begin];
    for (int i = begin, j = 0; i < end; i++, j++) {
        result[j] = this.chars[i];
    }
    return new MyString1(result);

}
public MyString1 toLowerCase(){
       char []ch=new char[this.chars.length];
    for (int i = 0; i <ch.length ; i++) {
        if (chars[i]<='Z' && chars[i]>='A')
           ch[i]=(char)(chars[i]+32);
        else
            ch[i]=chars[i];
    }

    return new MyString1(ch);
    }

public boolean equals(MyString1 s){
        if (s.length()!=chars.length)
            return  false;
    for (int i = 0; i <chars.length ; i++) {
        if (chars[i]!=s.charAt(i))
            return false;
    }

    return true;
    }


}
