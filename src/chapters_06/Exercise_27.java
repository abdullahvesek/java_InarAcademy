package chapters_06;

public class Exercise_27 {

	public static void main(String[] args) {
		System.out.println("the first 100 emirps are:  ");
		printt();
		
		

	}

public static void printt() {
	int count=0;
	int num=2;
	
	while(count<=100) {
		
		if(isPrime(num)&&isPrime(reverse(num))) {
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

public static boolean isPrime(int num) {
	for (int divisor = 2; divisor <= num/2; divisor++) {
		if (num % divisor == 0) { 
			return false;
		}
	}
	return true;

}

public static int reverse(int num) {
	String s=num+"";
	String str="";
	
	for(int i=s.length()-1;i>=0;i--) {
		str+=s.charAt(i);
	}

return Integer.parseInt(str);

}
}
