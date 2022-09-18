package chapters_06;

public class Exercise_08 {

	public static void main(String[] args) {
		
		
		System.out.println("celcius   fahrenheit |     fahrenheit       celcius");
		
for(double c=40.0,f=120.0;c>=31.0;c--,f-=10) {
	System.out.printf("%.1f%5s%.2f%8s%.1f%5s%.2f\n",c,"      ",celsiusTo(c),"    |     ",f,"        ",fahrenheitTo(f));
	
}
			
			
		

	
	}

	public static double celsiusTo(double celsius) {
		return (9.0 / 5) * celsius + 32;

	}

	public static double fahrenheitTo(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
}
}