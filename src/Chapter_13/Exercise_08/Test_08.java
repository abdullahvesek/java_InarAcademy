package Chapter_13.Exercise_08;

public class Test_08 {
    public static void main(String[] args) throws CloneNotSupportedException {

        MyStack m=new MyStack();

        m.push(1);
        m.push(2);
        m.push(3);

        MyStack m2=(MyStack) m.clone();

        System.out.println("the 2 stack is equal "+(m==m2));
    }
}
