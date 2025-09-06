Q ) Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.


makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]

Ans:

public int[] makeLast(int[] nums) {
  int[] newArr = new int[nums.length*2];
  
  newArr[newArr.length-1] = nums[nums.length-1];
  
  return newArr;
}


Output:

makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]	[0, 0, 0, 0, 0, 6]	OK	
makeLast([1, 2]) → [0, 0, 0, 2]	[0, 0, 0, 2]	OK	
makeLast([3]) → [0, 3]	[0, 3]	OK	
makeLast([0]) → [0, 0]	[0, 0]	OK	
makeLast([7, 7, 7]) → [0, 0, 0, 0, 0, 7]	[0, 0, 0, 0, 0, 7]	OK	
makeLast([3, 1, 4]) → [0, 0, 0, 0, 0, 4]	[0, 0, 0, 0, 0, 4]	OK	
makeLast([1, 2, 3, 4]) → [0, 0, 0, 0, 0, 0, 0, 4]	[0, 0, 0, 0, 0, 0, 0, 4]	OK	
makeLast([1, 2, 3, 0]) → [0, 0, 0, 0, 0, 0, 0, 0]	[0, 0, 0, 0, 0, 0, 0, 0]	OK	
makeLast([2, 4]) → [0, 0, 0, 4]	[0, 0, 0, 4]	OK