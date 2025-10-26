HashSet:

I want my hashset to store insertion order.by using two ways it can be done.

1)LinkedHashSet
2)TreeSet


1)If we are inserting values in the hashset and we want to follow insertion order then we have to use.

ex:

package Collections;

import java.util.LinkedHashSet;
public class HashSetEx {
    public static void main(String[] args) {
        LinkedHashSet hs = new LinkedHashSet();

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

[10, 20, 0, John, 10.9, 20.5]


2)TreeSet:

If we are inserting data in the hashset and it is coming in the ascending order then we have to use Treeset.

ex:

package Collections;

import java.util.TreeSet;
public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Object> hs = new TreeSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(0);
        hs.add(10);

        System.out.println(hs);
    }
}

o/p:


[0, 10, 20]
