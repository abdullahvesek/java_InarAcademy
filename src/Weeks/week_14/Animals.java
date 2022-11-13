package Weeks.week_14;

public class Animals {
    private double weight;
    private double height;
    private boolean canSwim;
    private boolean canFly;



    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public Animals(){
        this(350,175,true,false);
    }

public Animals(double weight,double height,boolean canSwim,boolean canFly){
        this.weight=weight;
        this.height=height;
        this.canSwim =canSwim;
        this.canFly =canFly;
}

public void breath(){
   setHeight(getHeight()+0.9);
   setCanSwim(true);
}
public void eats(double food){
         setWeight(getWeight()+food);
}
public void sleeps(){

}
}
