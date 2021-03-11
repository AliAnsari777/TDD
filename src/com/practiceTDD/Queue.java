package com.practiceTDD;

public class Queue {
    int[] values;
    int rare, front;

    Queue(int size){
        values = new int[size];
        rare = 0;
        front = 0;
    }

    public boolean enqueue(int value){
        if (rare == values.length){
            return false;
        }else{
            values[rare] = value;
            rare++;
            return true;
        }
    }

    public int peek(){
        if(values.length == 0)
            return 0;
        else
            return values[front];
    }

    public int dequeue(){
        if (rare == front){
            throw new NullPointerException();
        }
        int value = values[front];
        front++;
        return value;
    }
}
