package chapters_05;

public class Exercise_10 {

	public static void main(String[] args) {
		final int PER=10;
		int i=100;
		int count=0;
		
		
		while (i<1001) {
			if(i%6==0 && i%5==0) {
				
				count++;
				if(count%PER==0) {
					System.out.println(i);
				
				}
					
				else
					System.out.print(i+" ");
			}
		
		
			i++;
			
		
		
		
		}

	}

}
