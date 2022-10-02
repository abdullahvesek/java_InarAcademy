package chapters_07;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("enter two string:  ");
       String s1=input.next();
       String s2=input.next();
       
       System.out.println("the situation is: "+isRotation(s1,s2));
       

    
    }

public static boolean isRotation(String s1,String s2) {
	for(int i=1;i<s1.length();i++) {
		
		String s=s1.substring(s1.length()-i)+s1.substring(0,s1.length()-i);
		
		if(s2==s) {
			return true;
			
		}
	
	
	}

      return false;  

}



}
