Q ) Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.


firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false

Ans:

public boolean firstLast6(int[] nums) {
  if((nums.length>=1) && (nums[0]==6 || nums[nums.length-1]==6)){
    return true;
  }
  return false;
}


Output: 

firstLast6([1, 2, 6]) → true	true	OK	
firstLast6([6, 1, 2, 3]) → true	true	OK	
firstLast6([13, 6, 1, 2, 3]) → false	false	OK	
firstLast6([13, 6, 1, 2, 6]) → true	 true	OK	
firstLast6([3, 2, 1]) → false	false	OK	
firstLast6([3, 6, 1]) → false	false	OK	
firstLast6([3, 6]) → true	true	OK	
firstLast6([6]) → true	true	OK	
firstLast6([3]) → false	false	OK	
firstLast6([5, 6]) → true	true	OK	
firstLast6([5, 5]) → false	false	OK	
firstLast6([1, 2, 3, 4, 6]) → true	true	OK	
firstLast6([1, 2, 3, 4]) → false	false	OK
