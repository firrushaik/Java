
package ArrayList;

import java.util.ArrayList;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,3,8,9};

        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i=0;i<arr.length;i++){
            if(!result.contains(arr[i])){
                result.add(arr[i]);
            }
        }

        System.out.println(result);
    }
}

output:

[1, 2, 3, 4, 5, 8, 9]
