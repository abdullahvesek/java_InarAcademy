package chapters_05;

public class Exercise_19 {

	public static void main(String[] args) {
		for(int row=1;row<=8;row++) {
			
		
		for(int k=8-row;k>=1;k--) {
			System.out.print("  ");
		}
		
		for(int i=1;i<=row;i++) {
			System.out.print( (int)Math.pow(2, i-1)+"  ");
		}
		
		for(int a=row;a>=2;a--) {
			System.out.print((int)Math.pow(2, a-2)+"  ");
		}
		
		System.out.println();
		}

	}

}
