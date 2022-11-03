package Chapter_10;

public class Queue {
    int[]elements;
    int size;

    Queue (){
        elements=new int[8];
    }

    public void enqueue(int v){
        if (size>= elements.length){
            int[]temp=new int[elements.length*2];
          System.arraycopy(elements,0,temp,0,elements.length);
        elements=temp;
        }
   elements[size]=v;
        size++;
    }

    public int dequeue(){
        int a=elements[0];
        for (int i = 0; i < elements.length-1 ; i++) {
            elements[i]=elements[i+1];

        }
    size--;
   return a;
    }

public boolean empty(){
        if(size==0)
       return true;
        else
            return false;
    }
public int getSize(){
        return size;
}

    public static void main(String[] args) {
        Queue vesek = new Queue();



        for (int i = 1; i <= 20; i++) {
            vesek.enqueue(i);
        }


        while (!vesek.empty()) {
            System.out.print(vesek.dequeue() + " ");
        }
        System.out.println();
    }

}


