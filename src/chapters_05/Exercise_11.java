package chapters_05;

public class Exercise_11 {

	public static void main(String[] args) {
	final int PER=10;
	int count=0;
	
	
	
	for (int i=100;i<201;i++) {
		if ((i%5==0 && i%6!=0)||(i%5!=0 && i%6==0)) {
			count++;
			
			if (count%PER==0)
				System.out.println(i);
			else
				System.out.print(i+" ");
			
		}
	
	
	}
	}

}
