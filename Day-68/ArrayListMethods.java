

package ArrayList;


import java.util.ArrayList;
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();

        al1.add(10);
        al1.add(20);
        al1.add(30);
        System.out.println(al1);

//        al1.addAll(2,60);

        System.out.println(al1.size()); // it will give the size of the array

        al1.set(2,90); // it will remove the element which is present in the given index and fixed in that place
        System.out.println(al1);


        System.out.println(al1.get(2)); // it will give the element which is present in that index

        al1.remove(1); // it will remove the element present in that index
        System.out.println(al1);

        System.out.println(al1.contains(90)); // it will check the arrayList , if it is present that element it will give as boolean result
    }

}


output:

[10, 20, 30]
3
[10, 20, 90]
90
[10, 90]
true
