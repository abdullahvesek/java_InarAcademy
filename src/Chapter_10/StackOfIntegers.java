package Chapter_10;

import java.util.Scanner;

public class StackOfIntegers {

        private int[] elements;
        private int size;
        public static final int DEFAULT_CAPACITY = 16;


        public StackOfIntegers() {
            this(DEFAULT_CAPACITY);
        }


        public StackOfIntegers(int capacity) {
            elements = new int[capacity];
        }


        public void push(int value) {
            if (size >= elements.length) {
                int[] temp = new int[elements.length * 2];
                System.arraycopy(elements, 0, temp, 0, elements.length);
                elements = temp;
            }

            elements[size++] = value;
        }


        public int pop() {
            return elements[--size];
        }


        public int peek() {
            return elements[size - 1];
        }

        public boolean empty() {
            return size == 0;
        }


        public int getSize() {
            return size;
        }




        public static void main(String[] args) {
            Chapter_10.StackOfIntegers vesek=new Chapter_10.StackOfIntegers();
            System.out.println("enter a number for prime numbers:");
            Scanner input=new Scanner(System.in);
            int number= input.nextInt();
            smallest(number,vesek);
            while (!vesek.empty()) {
                System.out.print(vesek.pop() + " ");
            }
            System.out.println();
        }


        public static void smallest(int number, Chapter_10.StackOfIntegers stack){
            int i=2;
            while (number/i!=1){
                if (number % i == 0) {
                    stack.push(i);
                    number /= i;
                }
                else
                    i++;
            }
            stack.push(number);
        }
    }


