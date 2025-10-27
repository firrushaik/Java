
package Collections;
import java.util.TreeMap;
public class TreeMapEx {
    public static void main(String[] args) {
// TreeMap<Integer,Integer> treeMap= new TreeMap<>();
// treeMap.put(2,1);
// treeMap.put(5,2);
// treeMap.put(3,1);
// treeMap.put(1,8);
// System.out.println(treeMap);
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Alice", 1);
        treeMap.put("alice", 2);
        treeMap.put("alia", 4);
        System.out.println(treeMap);
    }
}

o/p:

{Alice=1, alia=4, alice=2}
