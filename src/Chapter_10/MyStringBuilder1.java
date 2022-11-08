package Chapter_10;

public class MyStringBuilder1 {
 private String s;

 MyStringBuilder1(String s){
     this.s=s;
 }
public MyStringBuilder1 append(MyStringBuilder1 s){
     String result=this.s;
    result+=s;
    return new MyStringBuilder1(result);

}
public MyStringBuilder1 append(int i){
     String result=this.s;
     result+=i+"";
     return new MyStringBuilder1(result);

}
public int length(){
     return s.length();
}
public char charAt(int index){
     return s.charAt(index);
}
public MyStringBuilder1 toLowerCase(){
     char[]ch=new char[s.length()];
    for (int i = 0; i <s.length() ; i++) {
        if (s.charAt(i)<='Z' && s.charAt(i)>='A')
       ch[i]=(char) (s.charAt(i)+32);
        else
            ch[i]=s.charAt(i);
    }

 String re=new String(ch);
    return new MyStringBuilder1(re);

 }
public MyStringBuilder1 substring(int begin,int end){
     char []ch=new char[end-begin];
    for (int i = begin,j=0; i <end ; i++,j++) {
        ch[j]=s.charAt(i);
    }
String re=new String(ch);
    return new MyStringBuilder1(re);

 }
public String toString(){
     return s;
}


}
