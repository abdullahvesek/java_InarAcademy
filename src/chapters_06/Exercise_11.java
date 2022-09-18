package chapters_06;

public class Exercise_11 {

	public static void main(String[] args) {
		
System.out.println("sales amount |  comission");
	
  for(double i=10000;i<=100000;i+=5000) {
	  System.out.printf("%.1f%8s%.1f\n",i,"      |   ",computeCommission(i));
	  
  }
	
	
	
	
	
	
	}

	
	
	
	
	
	
	
	public static double computeCommission(double salesAmount) {
		if(salesAmount<=15000)
			return salesAmount*0.08;
		else if(salesAmount<=25000)
			return 15000*0.8+(salesAmount-15000)*0.10;
		else 
			return 15000*0.8+10000*0.10+(salesAmount-25000)*0.12;
		
	}
	
	
	
}
