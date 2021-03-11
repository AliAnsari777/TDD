package com.practiceTDD;

public class Queue {
    int[] values;
    int rare, front;


    public int peek(){
        if(values.length == 0)
            return 0;
        else
            return values[front];
    }
}
