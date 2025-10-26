
Java HashSet:

A HashSet is a collection of elements where every element is unique.

It is part of the java.util package and implements the Set interface.

key points:

1)hashset stores the unique values.
2)It cannot stores the duplicate values.
3)It can store the heterogeneus data.which means int, float ,double,string at a time.
4)null values are also stored.
5)It does not follow the insertion order.

ex:

package Collections;

import java.util.HashSet;
public class HashSetEx {
    public static void main(String[] args) {
        HashSet hs = new HashSet();

        hs.add(10);
        hs.add(20);
        hs.add(0);
        hs.add(10);
        hs.add("John");
        hs.add(10.9f);
        hs.add(20.5);

        System.out.println(hs);
    }
}

o/p:


[0, 20, 20.5, John, 10.9, 10]

