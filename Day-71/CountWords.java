package Collections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
public class CountWords {
    public static void main(String[] args) {
        String str = "fear leads to anger anger leads to hatred hatred leads to conflict conflict leads to suffering";
        String[] word = str.split(" ");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String element : word) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
//     System.out.println(map);
//      print unique words
//     for(Map.Entry<String,Integer> entry: map.entrySet()) {
//      if(entry.getValue()==1) {
//      System.out.println(entry.getKey());
//    }
// }
// print duplicate words
//       for(Map.Entry<String,Integer> entry:map.entrySet()) {
//           if(entry.getValue()>1) {
//              System.out.println(entry.getKey());
//    }
//  }
// print words which has occurred most of the times
// int max = Integer.MIN_VALUE;
// String maxWord = "";
//
// for(Map.Entry<String,Integer> entry:map.entrySet()) {
// if(entry.getValue()>max) {
// max = entry.getValue();
// maxWord = entry.getKey();
//    }
//}
//System.out.println(maxWord);
        int max = Integer.MIN_VALUE;
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                arrayList.clear();
                arrayList.add(entry.getKey());
                max = entry.getValue();
            } else if (entry.getValue() == max) {
                arrayList.add(entry.getKey());
            }
        }
        System.out.println(arrayList);
    }
}



o/p:

[leads, to]
