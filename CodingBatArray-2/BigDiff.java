Q) Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.


bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8

Ans:

public int bigDiff(int[] nums) {
  int min = Integer.MAX_VALUE;
  int max = Integer.MIN_VALUE;
  
  for(int i = 0;i<nums.length;i++){
    if(nums[i] < min){
      min = nums[i];
    }
    if(nums[i] > max){
      max = nums[i];
    }
  }
  
  return max-min;
}


output:

bigDiff([10, 3, 5, 6]) → 7	7	OK	
bigDiff([7, 2, 10, 9]) → 8	8	OK	
bigDiff([2, 10, 7, 2]) → 8	8	OK	
bigDiff([2, 10]) → 8	8	OK	
bigDiff([10, 2]) → 8	8	OK	
bigDiff([10, 0]) → 10	10	OK	
bigDiff([2, 3]) → 1	1	OK	
bigDiff([2, 2]) → 0	0	OK	
bigDiff([2]) → 0	0	OK	
bigDiff([5, 1, 6, 1, 9, 9]) → 8	8	OK	
bigDiff([7, 6, 8, 5]) → 3	3	OK	
bigDiff([7, 7, 6, 8, 5, 5, 6]) → 3	3	OK