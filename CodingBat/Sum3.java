Q ) Given an array of ints length 3, return the sum of all the elements.


sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7

Ans:

public int sum3(int[] nums) {
  int sum = 0;
  if(nums.length == 3){
    return sum= nums[0] + nums[1] + nums[2];
    }
    return sum;
}


Output:

sum3([1, 2, 3]) → 6	6	OK	
sum3([5, 11, 2]) → 18	18	OK	
sum3([7, 0, 0]) → 7	7	OK	
sum3([1, 2, 1]) → 4	4	OK	
sum3([1, 1, 1]) → 3	3	OK	
sum3([2, 7, 2]) → 11	11	OK