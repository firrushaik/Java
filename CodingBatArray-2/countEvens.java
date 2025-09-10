Q ) Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.


countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0

Ans:

public int countEvens(int[] nums) {
  int count = 0;
  
  for(int i = 0; i<nums.length;i++){
    if(nums[i] % 2 == 0){
      count++;
    }
  }
  return count;
}


OutPut:

countEvens([2, 1, 2, 3, 4]) → 3	3	OK	
countEvens([2, 2, 0]) → 3	3	OK	
countEvens([1, 3, 5]) → 0	0	OK	
countEvens([]) → 0	0	OK	
countEvens([11, 9, 0, 1]) → 1	1	OK	
countEvens([2, 11, 9, 0]) → 2	2	OK	
countEvens([2]) → 1	1	OK	
countEvens([2, 5, 12]) → 2	2	OK	