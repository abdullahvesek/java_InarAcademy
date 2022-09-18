package chapters_06;

public class Exercise_09 {

	public static void main(String[] args) {
		System.out.println("foot    meters  |   meters     feet");
		
		for(double f=1.0,m=20.0;f<=10.0;f++,m+=5.0) {
			
			System.out.printf("%.1f%5s%.2f%6s%2f%5s%.2f\n",f,"    ",footTo(f),"  |    ",m,"     ",meterTo(m));
			
		}

	}

	public static double footTo(double foot) {
		return 0.305 * foot;
	}

	public static double meterTo(double meter) {
		return 3.279 * meter;
	}



}
