package Weeks.week_14;

public class Lion {
    private double tail;
    private double weight;
    private double height;
    private boolean canSwim;


    private boolean canFly;

    public double getTail() {
        return tail;
    }

    public void setTail(double tail) {
        this.tail = tail;
    }

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

    Lion(){
       this(45,300,95,true,false);
    }

Lion(double tail,double weight,double height,boolean canSwim,boolean canFly){
        this.tail=tail;
        this.weight=weight;
        this.height=height;
        this.canSwim =canSwim;
        this.canFly =canFly;
}

public void eat(double food){
    setWeight(getWeight()+food);
}
public void runs(double sec){
        setWeight(getWeight()-sec*0.20);
}
public void sleeps(){

}
public void roars(){

}


}
