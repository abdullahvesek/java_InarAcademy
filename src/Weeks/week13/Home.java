package Weeks.week13;

public class Home {
    private double surface;
    private int numberOfBath;
    private int numberOfRoom;
    private boolean hasGarage;
    private double fee;
    private String face;
    private int year;

    Home(){
        this(180,2,3,false,5000,"North",2015);

    }

    Home(double surface,int numberOfBath,int numberOfRoom,boolean hasGarage,double fee,String face,int year){
        this.surface=surface;
        this.numberOfBath=numberOfBath;
        this.numberOfRoom=numberOfRoom;
        this.hasGarage=hasGarage;
        this.fee=fee;
        this.face=face;
        this.year=year;

    }

    public double getSurface() {
        return surface;
    }

    public int getNumberOfBath() {
        return numberOfBath;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public double getFee() {
        return fee;
    }

    public String getFace() {
        return face;
    }

    public int getYear() {
        return year;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public void setNumberOfBath(int numberOfBath) {
        this.numberOfBath = numberOfBath;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void print(){
        System.out.println("the home's surface is "+getSurface()+"\n"+"number of bath is "+getNumberOfBath()+"\n"+" number of room is "+getNumberOfRoom()
                +"\n"+" has"+(isHasGarage()?"  garage":" not garage")+" \n"+" the fee is "+getFee()+"\n"+" the face is "+getFace()+"\n"+" the made year is "+getYear());


    }

    public static void main(String[] args) {
        Home h1=new Home();
       Home h2=new Home(129,2,5,true,4500,"South",2020);

        System.out.println("the information about home 1: ");
        h1.print();
        System.out.println("\n\n");
        System.out.println("the information about home 2: ");
        h2.print();
    }


}
