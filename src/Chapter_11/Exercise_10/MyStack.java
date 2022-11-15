package Chapter_11.Exercise_10;
import java.util.ArrayList;
public class MyStack extends java.util.ArrayList{

private ArrayList<Object>list;

public MyStack(){
    list=new ArrayList<Object>();

}
public void push(Object o){
    list.add(0,o);
}

public Object peek(){
    Object o=list.get(0);
    return o;
}
public Object pop(){
    Object o=list.get(0);
    list.remove(0);
    return o;
}
@Override
    public String toString(){
    return list.toString();
}


}
