package chapters_05;

public class Exercise_07 {

	public static void main(String[] args) {
		double cost=10000;
		int year=1;
		double rate=0.05;
		
		while(year<11) {
			cost=(cost+cost*rate);
			
		}
	
		
		
		double total = 0;
		
	int i=1;
	while (i<5) {
		cost=cost+cost*rate;
		
		total+=cost;
		
		
	}
	
	System.out.println("the total is:  "+total);
	
	}

}
