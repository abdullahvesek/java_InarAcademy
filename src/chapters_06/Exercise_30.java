package chapters_06;

public class Exercise_30 {

	public static void main(String[] args) {
		int x=(int)((Math.random()*6)+1);
		int y=(int)((Math.random()*6)+1);
		
		int result=x+y;
		
		
		switch(result) {
		case 2:System.out.println("you rolled  "+result+"you win");break;
		case 3:System.out.println("you rolled  "+result+"you win");break;
		case 4:System.out.println("you rolled  "+result);
		do {
			 
			System.out.println("point is"+result);
			x=(int)((Math.random()*6)+1);
			 y=(int)((Math.random()*6)+1);
			
		}while(x+y!=7||x+y!=result);break;
		case 5:System.out.println("you rolled  "+result);
		do {
			 
			System.out.println("point is"+result);
			x=(int)((Math.random()*6)+1);
			 y=(int)((Math.random()*6)+1);
			
		}while(x+y!=7||x+y!=result);break;
		case 6:System.out.println("you rolled  "+result);
		do {
			 
			System.out.println("point is"+result);
			x=(int)((Math.random()*6)+1);
			 y=(int)((Math.random()*6)+1);
			
		}while(x+y!=7||x+y!=result);break;
		case 7:System.out.println("you win!");
		case 8:System.out.println("you rolled  "+result);
		do {
			 
			System.out.println("point is"+result);
			x=(int)((Math.random()*6)+1);
			 y=(int)((Math.random()*6)+1);
			
		}while(x+y!=7||x+y!=result);break;
		case 9:System.out.println("you rolled  "+result);
		do {
			 
			System.out.println("point is"+result);
			x=(int)((Math.random()*6)+1);
			 y=(int)((Math.random()*6)+1);
			
		}while(x+y!=7||x+y!=result);break;
		case 10:System.out.println("you rolled  "+result);
		do {
			 
			System.out.println("point is"+result);
			x=(int)((Math.random()*6)+1);
			 y=(int)((Math.random()*6)+1);
			
		}while(x+y!=7||x+y!=result);break;
		case 11:System.out.println("you win");break;
		case 12:System.out.println("you lose!");break;
		
		
		
		}
	}

}
