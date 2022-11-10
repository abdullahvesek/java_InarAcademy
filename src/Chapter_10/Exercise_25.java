package Chapter_10;

public class Exercise_25 {
    public static void main(String[] args) {
        String s = "?ab?vesek?#gfe?";
        String regex = "[#?]";
        String[] split = split(s, regex);
        displaySplit(split);
    }

    public static void displaySplit(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }


public static String[]split(String s,String regex){
int size=findNewSize(s,regex);
String[]result=new String[size];
String temp="";
int index=0;

    for (int i = 0; i <s.length() ; i++) {
        if (!(isRegex(s.charAt(i),regex))){
            temp+=s.charAt(i);
        }

    if (isRegex(s.charAt(i),regex)){
        if (!temp.equals("")){
            result[index++]=temp;
            temp="";
        }
    result[index++]=s.charAt(i)+"";

    }
    }
if (!temp.equals("")){
    result[index]=temp;
}
return result;
    }


public static boolean isRegex(char c,String regex){
    for (int i = 0; i <regex.length() ; i++) {
        if (regex.charAt(i)==c)
            return true;
    }
return false;
    }
public static int findNewSize(String s,String regex){
        int normal=0;
        int numberOfR=0;

        if (isRegex(s.charAt(0),regex)){
            numberOfR++;
        }
    for (int i = 1; i <s.length() ; i++) {
        if (isRegex(s.charAt(i),regex)){
            if (!(isRegex(s.charAt(i-1),regex))){
                normal++;
            }
        numberOfR++;
        }

    }
if (!(isRegex(s.charAt(s.length()-1),regex)))
normal++;
   return normal+numberOfR;
    }



}
