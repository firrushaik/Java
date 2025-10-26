

package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "hellorockstar";

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

//        System.out.println(set);

        String result = " ";

        Iterator<Character> iterator = set.iterator();
           while(iterator.hasNext()){
               result += iterator.next();
        }
        System.out.println(result);
    }
}


o/p:

 helorcksta
