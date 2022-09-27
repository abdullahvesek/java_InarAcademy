package chapters_06;

public class Exercise_32 {

	public static void main(String[] args) {
		long n=System.currentTimeMillis();
		
		n/=1000;
		String toplamsaniye=n+"";
		String anlıksaniye=n%60+"";
		String toplamdakika=n/60+"";
		String anlıkdakika=(n/60)%60+"";
		String toplamsaat=n/60/60+"";
		String anlıksaat=(n/60/60)%24+"";
		
		
		System.out.println(anlıksaat+"  "+anlıkdakika+"  "+anlıksaniye);

	}

}
