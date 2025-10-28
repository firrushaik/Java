
Deque in Java:

In Java, the Deque (short for "Double-Ended Queue") is an interface in the java.util package that extends the Queue interface. 
It allows elements to be added or removed from both ends of the queue, making it more versatile than a standard queue or stack.

import java.util.*;

public class ArrayDeque {
    public static void main(String[] args)
    {
        // Initializing an deque
        Deque<String> dq = new ArrayDeque<String>();

        // add() method to insert
        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");

        System.out.println(dq);
    }
}

o/p:

[Geeks, For, Geeks]
