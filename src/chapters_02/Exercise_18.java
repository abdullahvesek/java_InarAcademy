package chapters_02;

public class Exercise_18 {

	public static void main(String[] args) {
		float a;
		float b;
		
		System.out.println("a  b   Math.pow(a,b)");
		
		a=1;
		b=2;
		for(int i =0 ; i<=4 ; i++) {
			System.out.println((int)a + "  "+ (int)b + "   "+ (int)Math.pow(a, b));
			a++;
			b++;
			
		}

	}

}
