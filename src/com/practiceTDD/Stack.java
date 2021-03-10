package com.practiceTDD;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    List<Integer> values = new ArrayList<>();
    int top = -1;

    public void push(int number){
        values.add(number);
        top++;
    }

    public Integer peek(){
        if (values.isEmpty())
            return null;
        else
            return values.get(top);
    }

    public Integer pop(){
        if (values.isEmpty())
            return null;
        else {
            int value = values.remove(top);
            top--;
            return value;
        }
    }

}
