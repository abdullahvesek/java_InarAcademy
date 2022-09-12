package chapters_05;

public class Exercise_39 {

	public static void main(String[] args) {
	
		
		double comission=0;
		double amount=5000;
		double salesamount=0;
		
		do {
			salesamount+=0.01;
			amount=5000;
			
			
		if(salesamount<5000) {
		comission = salesamount*0.08;
		amount+=comission;
		
		}
		
		if(salesamount<=10000) {
			comission=(salesamount-5000)*0.10+(5000*0.08);
			amount+=comission;
			
		}
		
		if(salesamount>10000) {
			comission=(salesamount-10000)*0.12+5000*0.10+5000*0.08;
			amount+=comission;
		}
		
		
		
		
		}while(amount<30000);
		
System.out.println("the salesamount is:  "+ salesamount);
	}

}
