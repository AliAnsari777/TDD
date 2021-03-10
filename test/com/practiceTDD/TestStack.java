package com.practiceTDD;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.junit.jupiter.api.Assertions.*;

public class TestStack {
    List<Integer> temporary = new ArrayList<>();
    Stack stack = new Stack();

    @Test
    public void testPush(){
        stack.push(10);
        temporary.add(10);
        assertIterableEquals(stack.values, temporary);
        stack.push(20);
        temporary.add(20);
        assertIterableEquals(stack.values, temporary);
    }

    @Test
    public void testPeek(){
        assertEquals(stack.peek(), null);
        stack.push(10);
        stack.push(29);
        assertEquals(stack.peek(), 29);
    }

    @Test
    public void testPop(){
        assertEquals(stack.pop(), null);
    }
}
