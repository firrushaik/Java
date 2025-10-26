
package Collections;

import java.util.LinkedHashSet;
public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "hellorockstar";

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(int i = 0; i<str.length();i++){
            set.add(str.charAt(i));
        }

        System.out.println(set);
    }
}


o/p:

[h, e, l, o, r, c, k, s, t, a]
