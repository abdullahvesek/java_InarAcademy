package chapters_05;

public class Exercise_33 {

	public static void main(String[] args) {
		
int sum=0;
		
		for(int i=6; i<10000;i++) {
			sum=0;
			
			for(int k=1; k<=i/2; k++) {
				if (i%k==0)
					sum+=k;
				
				
			}
		
		if(sum==i)
			System.out.print(i+" ");
		}
	
	
	
	
	}

}
