package com.practiceTDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestQueue {
    Queue queue = new Queue();
    int[] testValues;

    @Test
    public void enqueue(){

    }

    @Test
    public void isQueueEmpty(){
        assertEquals(queue.peek(), 0);
    }
}
