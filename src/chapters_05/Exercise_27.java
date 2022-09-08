package chapters_05;

public class Exercise_27 {

	public static void main(String[] args) {
		
		
		int count=0;
		

	for(int i=101; i<2101; i++) {
	if	((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
		
	count++;
	
	if (count%10==0)
		System.out.println(i);
	else
		System.out.print(i+" ");
	
	}
	
	}
System.out.println();
	System.out.println("the number of leap year is:  "+count);
}
}