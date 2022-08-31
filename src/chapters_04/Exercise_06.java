package chapters_04;

public class Exercise_06 {

	public static void main(String[] args) {
		final double RADIUS=40;
	double angel1=Math.random()*2*Math.PI;
	double angel2=Math.random()*2*Math.PI;
	double angel3=Math.random()*2*Math.PI;
	
	
	double x1=RADIUS*Math.cos(angel1);
	double y1=RADIUS*Math.sin(angel1);
	double x2=RADIUS*Math.cos(angel2);
	double y2=RADIUS*Math.cos(angel2);
	double x3=RADIUS*Math.cos(angel3);
	double y3=RADIUS*Math.cos(angel3);
	
	
	int a =  (int) Math.sqrt(Math.pow(x2-x3, 2)+ Math.pow(y2-y3, 2));
	int b =  (int) Math.sqrt(Math.pow(x1-x3, 2)+ Math.pow(y1-y3, 2));
	
	
int c =   (int) Math.sqrt(Math.pow(x1-x2, 2)+ Math.pow(y1-y2, 2));
	
	
	System.out.println("the 3 side is:  "+ a +"  "+b+"   "+c);
	
	
	
	
	
	
	
	}

}
