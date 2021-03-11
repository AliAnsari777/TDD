package com.practiceTDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQueue {
    Queue queue = new Queue(2);
    int[] testValues;

    @Test
    public void testEnqueue(){
        assertTrue(queue.enqueue(10));
        assertTrue(queue.enqueue(20));
    }

    @Test
    public void isQueueEmpty(){
        assertEquals(queue.peek(), 0);
    }

    @Test
    public void testDequeue(){
        queue.enqueue(14);
        assertEquals(14, queue.dequeue());
        queue.enqueue(12);
        queue.enqueue(32);
        assertEquals(12, queue.dequeue());
    }

    @Test
    public void checkIsQueueNull(){
        assertThrows(NullPointerException.class, () -> {
            queue.dequeue();
        });
    }
}
