package DAY_5.Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Queue_Using_Array{
    private int default_size = 3;
    private int[] array;

    private int enqueRef;

    private int dequeRef;

    public Queue_Using_Array(int size) {
        // space complexity: O(n)
        // time complexity: O(1)
        this.array = new int[size];
        this.dequeRef = array.length;//4
        this.enqueRef = array.length-1; //3
    }

    public Queue_Using_Array() {
        // space complexity: O(1)
        // time complexity: O(1)
        this.array = new int[default_size];
        this.dequeRef = array.length;
        this.enqueRef = array.length-1;
    }

    boolean enqueque(int input){
        if(isFull()){
            return false;
        }

        move(dequeRef);
        dequeRef = dequeRef - 1;
        array[enqueRef] = input;
        return true;
    }

    public int dequeque(){
        if(isEmpty()){
            return -1;
        }
        int temp = array[dequeRef];
        array[dequeRef] = 0;
        dequeRef = dequeRef + 1;
        return temp;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return array[dequeRef];
    }

    public boolean isEmpty(){
        if (dequeRef == array.length)
            return true;
        else
            return false;
    }



    public boolean isFull(){
        if (dequeRef == 0)
            return true;
        else
            return false;
    }

    private void move(int ref){
        while(ref < array.length){
            array[ref-1] = array[ref];
            ref++;
        }
    }

    @Override
    public String toString() {
        return "Queue_Using_Array{" +
                "QUEUE=" + Arrays.toString(array) +
                '}';
    }
}


public class queue_user {
    public static void main(String[] arg){
        Queue_Using_Array qrr = new Queue_Using_Array();
        System.out.println("ENQUEUE");
        qrr.enqueque(1);
        qrr.enqueque(2);
        qrr.enqueque(3);
        System.out.println(qrr);
        System.out.println("DEQUEUE");
        qrr.dequeque();
        System.out.println(qrr);
        qrr.dequeque();
        System.out.println(qrr);
        qrr.dequeque();
        System.out.println(qrr);
    }
}
