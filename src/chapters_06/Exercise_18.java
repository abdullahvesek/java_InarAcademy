package chapters_06;

import java.util.Scanner;

public class Exercise_18 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a password:  ");
		String password=input.next();
		
		System.out.println(checkValidity(password));
		

	}

public static boolean checkValidity(String str) {
	if(str.length()<8) {
		return false;
	}
	int count=0;
	for(int i=0;i<=str.length()-1;i++) {
		
		if(Character.isDigit(str.charAt(i))) {
			count++;
		}
		
		if(!Character.isLetterOrDigit(str.charAt(i))) {
			return false;
		}
	
	
	
	}

if(count<2) {
	return false;
}

return true;

}



}
