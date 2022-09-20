package chapters_06;

public class Exercise_28 {

	public static void main(String[] args) {
		System.out.println("the mersenne numbers are:  ");
	
		System.out.println("n      |      2^n-1");
		
		
		
		mers();
	
		
		
	}

	public static boolean isPrime(double num) {
		for (int divisor = 2; divisor <= num/2; divisor++) {
			if (num % divisor == 0) { 
				return false;
			}
		}
		return true;

	}

public static void mers() {
	for(int i=2;i<=31;i++) {
		if(isPrime(i)&&isPrime(Math.pow(2, i)-1)) {
			System.out.printf("%3d%8s%.1f\n",i,"     ",Math.pow(2, i)-1);
	}
	}


}





}
