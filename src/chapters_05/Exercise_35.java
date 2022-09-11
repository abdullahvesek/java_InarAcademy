package chapters_05;

public class Exercise_35 {

	public static void main(String[] args) {
	
		double sum=0;
		
		for (int i=1; i<625 ; i++) {
			
			sum+=1/(Math.sqrt(i)+Math.sqrt(i+1));
			
		}

	System.out.printf("the sum is %.2f",sum);
	
	
	}

}
