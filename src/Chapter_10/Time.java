package Chapter_10;

public class Time {
    private int hour;
    private int minute;
    private int second;

    Time(){
        long milliseconds=System.currentTimeMillis();
        long sec=milliseconds/1000;
        this.second=(int)sec%60;
        long min=sec/60;
        this.minute=(int) min%60;
        long h=min/60;
        this.hour=(int) h%24;

    }

Time(long elapsed){

    long sec=elapsed/1000;
    this.second=(int)sec%60;
    long min=sec/60;
    this.minute=(int) min%60;
    long h=min/60;
    this.hour=(int) h%24;
}
Time( int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;

}

public int getHour(){
        return hour;
}

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

public Time setTime(long elapsed){
       return new Time(elapsed);
}

    public static void main(String[] args) {
        Time t1=new Time();
        Time t2=new Time(555550000);
        Time t3=new Time(5,23,55);

        System.out.println("the time t1 is "+t1.getHour()+" : "+t1.getMinute()+" : "+t1.getSecond());
        System.out.println("the time t2 is "+t2.getHour()+" : "+t2.getMinute()+" : "+t2.getSecond());
        System.out.println("the time t3 is "+t3.getHour()+" : "+t3.getMinute()+" : "+t3.getSecond());
    }


}
