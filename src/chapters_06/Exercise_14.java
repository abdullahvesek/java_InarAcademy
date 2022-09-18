package chapters_06;

public class Exercise_14 {

	public static void main(String[] args) {
		
System.out.println("i         m(i)");
System.out.println("-----------------");
for(double i=1;i<=901;i+=100) {
	System.out.printf("%.1f%8s%.5f\n",i,"        ",op(i));
	
}
		
		
	}

	
	
	
	
	
	
	
	
	public static double op(double num) {
	
	double sum=0;
	
	for(double i=1;i<=num;i++) {
	
		sum+=(Math.pow(-1, i+1))/(2*i-1);
		
	}
return 4*sum;


}
}
