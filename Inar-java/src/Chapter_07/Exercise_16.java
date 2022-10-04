package Chapter_07;

public class Exercise_16 {
    public static void main(String[] args) {
        int[]list=new int[100000];
        int key=(int)(Math.random()*100000)+1;
        for (int i = 0; i < list.length ; i++) {
            list[i]=(int)(Math.random()*100000)+1;
        }
   long startTime=System.currentTimeMillis();
        int resultLinear=linearSearch(list,key);
        long endTime=System.currentTimeMillis();
        long execution=endTime-startTime;

        System.out.println("for the linear search time is "+execution);



        long startTime2=System.currentTimeMillis();
        int resultBinary=binarySearch(list,key);
        long endTime2=System.currentTimeMillis();
        long execution2=endTime2-startTime2;

        System.out.println("for binary search time is: "+execution2);


    }

public static int linearSearch(int[]list,int key){
    for (int i = 0; i < list.length ; i++) {
        if(list[i]==key)
 return i;
    }
return -1;
    }

public static int binarySearch(int[]list,int key){
        int low=0;
        int high=list.length-1;

        while (high>=low){
            int mid=(low+high)/2;
            if(key<mid)
                high=mid-1;
            else if (key==mid)
                return mid;
            else
                low=mid+1;
                
            }
       return -low-1;

        }
}




