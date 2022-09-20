package chapters_06;

public class Exercise_29 {

	public static void main(String[] args) {
		display();
		

	}

public static void display() {
	
	int num=2;
	
while(num<=1000) {
	if(isPrime(num)&&isPrime(num+2)) {
		System.out.printf("%3d%8s%3d\n",num,"    ",num+2);
		
	}

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


}
