package Chapter_07;

public class Exercise_07 {
    public static void main(String[] args) {

        int []list=new int[10];

        for (int i = 1; i <=100 ; i++) {
            int a=(int)(Math.random()*10);
            list[a]++;

        }
        for (int i = 0; i <list.length ; i++) {
            System.out.println("the "+i +" counts "+list[i]+(list[i]>1?" times":" time"));
        }

    }
}
