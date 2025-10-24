

package ArrayList;

import java.util.ArrayList;
public class HeterogeniousElements {
    public static void main(String[] args) {
        ArrayList<Object> al1 = new ArrayList<Object>(); // here object is used to store multiple data types of elements inside the arraylist

        al1.add(10);
        al1.add("Hello");
        al1.add(7.3f);
        al1.add('d');
        al1.add(6.8);

        System.out.println(al1);

    }
}


output:

[10, Hello, 7.3, d, 6.8]

