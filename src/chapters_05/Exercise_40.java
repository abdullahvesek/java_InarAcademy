package chapters_05;

public class Exercise_40 {

	public static void main(String[] args) {
		
		int count=0;
		int count2=0;
		
		
		
		
		for(int i=1; i<1000000; i++) {
		int y= (int)(Math.random()*2);
		
		if (y==0)
			count++;
		else if (y==1)
			count2++;
		}

	
	System.out.println("number of heads are:  "+count+"  "+"number of tails are:  "+count2);
	
	
	}

}
