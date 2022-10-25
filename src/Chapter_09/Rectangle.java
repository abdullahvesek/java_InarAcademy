package Chapter_09;

public class Rectangle {
    private double width=1;
    private double height=1;

    Rectangle(){
    }

     Rectangle(double width,double height){
        this.height=height;
        this.width=width;
     }

   double getArea(){
        return (width * height);
   }
   double getPerimeter(){
       return 2*(width+height);
   }
   double getWidth(){
        return width;
   }
  double getHeight(){
        return height;
  }

   void setWidth(double width){
        this.width=width;
   }

  void setHeight(double height){
        this.height=height;
  }

    public static void main(String[] args) {
        Rectangle r1=new Rectangle(4,40);
        Rectangle r2=new Rectangle(3.5,35.9);

        System.out.println(" r1 's width is "+r1.getWidth()+" r1's height is " +r1.getHeight()+" the r1's area is "+r1.getArea()+" perimeter is "+ r1.getPerimeter());
        System.out.println(" r2 's width is "+r2.getWidth()+" r2's height is " +r2.getHeight()+" the r2's area is "+r2.getArea()+" perimeter is "+ r2.getPerimeter());
    }



}
