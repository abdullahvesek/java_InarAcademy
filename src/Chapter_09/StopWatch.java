package Chapter_09;

import java.util.Arrays;

public class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch(){
        this.startTime=System.currentTimeMillis();

    }
  long start(){
        return  startTime=System.currentTimeMillis();
  }
long stop(){
        return endTime=System.currentTimeMillis();
}

long getElapsedTime(){
        return endTime-startTime;

}

    public static void main(String[] args) {
        double[]numbers=new double[10000000];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]=Math.random()*100;

        }
   StopWatch s=new StopWatch();
        Arrays.sort(numbers);
        s.stop();
        long elap=s.getElapsedTime();

        System.out.println("the elapsed time is "+elap);

    }
}
