
package Collections;
import java.util.LinkedHashMap;
public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put(10, 1);
        hashMap.put(20, 2);
        hashMap.put(30, 1);
        System.out.println(hashMap);
    }
}


o/p:

{10=1, 20=2, 30=1}
