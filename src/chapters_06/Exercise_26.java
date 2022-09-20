package chapters_06;

public class Exercise_26 {

	public static void main(String[] args) {
		System.out.println("the first 100 palindromic prime numbers are\n" );
		printt();
		

	}

public static void printt() {
	int count=0;
	int num=2;
	while(count<=100) {
		
		if(isPalindrom(num)&&isPrime(num)) {
			count++;
		
			if(count%10==0)
				System.out.println(num);
			else
				System.out.print(num+" ");
			
			num++;
	
	}
		else 
			num++;
		
	}

}

public static boolean isPalindrom(int num) {
	
	String s=num+"";
	
	for(int i=0;i<s.length()/2;i++) {
		if(s.charAt(i)!=s.charAt(s.length()-1-i))
			return false;
			break;
	}

return true;

}


public static boolean isPrime(int num) {
	for (int divisor = 2; divisor <= num/2; divisor++) {
		if (num % divisor == 0) { 
			return false;
		}
	}
	return true;

}



}