Q) Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.


midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]

Ans:

public int[] midThree(int[] nums) {
  int[] newArr = new int[3];
  
  int mid = 0 + (nums.length-1) / 2 ;
  
  newArr[0] = nums[mid-1];
  newArr[1] = nums[mid];
  newArr[2] = nums[mid+1];
  
  return newArr;
}


OutPut:

midThree([1, 2, 3, 4, 5]) → [2, 3, 4]	[2, 3, 4]	OK	
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]	[7, 5, 3]	OK	
midThree([1, 2, 3]) → [1, 2, 3]	[1, 2, 3]	OK	