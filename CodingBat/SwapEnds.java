Q)Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.


swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]

Ans:

public int[] swapEnds(int[] nums) {
  int temp = nums[0];
   nums[0] = nums[nums.length-1];
   nums[nums.length-1] = temp;
   
   return nums;
}

Output:

swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]	[4, 2, 3, 1]	OK	
swapEnds([1, 2, 3]) → [3, 2, 1]	[3, 2, 1]	OK	
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]	[5, 6, 7, 9, 8]	OK	
swapEnds([3, 1, 4, 1, 5, 9]) → [9, 1, 4, 1, 5, 3]	[9, 1, 4, 1, 5, 3]	OK	
swapEnds([1, 2]) → [2, 1]	[2, 1]	OK	
swapEnds([1]) → [1]	[1]	OK	
