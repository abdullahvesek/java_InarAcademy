package Chapter_10;

public class Exercise_06 {
    public static void main(String[] args) {
        StackOfIntegers vesek=new StackOfIntegers();
        System.out.println("less than 120 prime numbers: ");
        prime(vesek,120);
        while (!vesek.empty()){
            System.out.print(vesek.pop()+" ");
        }
        System.out.println();
    }
   public static void prime(StackOfIntegers vesek,int number){
       for (int i = 2; i <120 ; i++) {
           if (isprime(i)){
               vesek.push(i);
           }
       }

    }

public static boolean isprime(int number){
    for (int i = 2; i <number/2 ; i++) {
        if (number%i==0)
            return false;

    }
return true;
    }



}
