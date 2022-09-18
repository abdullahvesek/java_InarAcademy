package chapters_06;

public class Exercise_10 {

	public static void main(String[] args) {
		
		for(int i=2;i<10001;i++) {
			if(isPrime(i))
				System.out.print(i+" ");
				
		}

	}

	
	
	
	public static boolean isPrime(int number){
		
		
		for(int i=2;i<=number/2;i++) {
			if (number%i==0&&number!=2)
				return false;
			
		}
		
	return true;
	}
	
	
}
