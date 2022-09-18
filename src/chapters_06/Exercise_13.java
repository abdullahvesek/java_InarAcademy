package chapters_06;

public class Exercise_13 {

	public static void main(String[] args) {
		
System.out.println("i         m(i)");

for (double i=1;i<=20;i++) {
	System.out.printf("%.1f%8s%.5f\n",i,"      ",op(i));
}
	
	
	
	
	
	}
	
	
	public static double op(double num) {
	
	double sum=0;
	
	
	for(double i=1;i<=num;i++) {
	sum+=i/(i+1);
	
	}

return sum;

}


}
