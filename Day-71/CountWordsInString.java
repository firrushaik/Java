
package Collections;

import java.util.LinkedHashMap;

public class CountWords {
    public static void main(String[] args) {
        String str = "fear leads to anger anger leads to hatred hatred leads to conflict conflict leads to suffering ";
        String[] word = str.split(" ");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String element : word) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        System.out.println(map);
    }
}


o/p:


{fear=1, leads=4, to=4, anger=2, hatred=2, conflict=2, suffering=1}
