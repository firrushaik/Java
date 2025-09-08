Q) Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.


frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]

Ans:

public int[] frontPiece(int[] nums) {
  int[] newArr = new int[2];
  if(nums.length<2){
    return nums;
  }
  else{
    newArr[0] = nums[0];
    newArr[1] = nums[1];
    return newArr;
  }
}


Output:

frontPiece([1, 2, 3]) → [1, 2]	[1, 2]	OK	
frontPiece([1, 2]) → [1, 2]	[1, 2]	OK	
frontPiece([1]) → [1]	[1]	OK	
frontPiece([]) → []	[]	OK	
frontPiece([6, 5, 0]) → [6, 5]	[6, 5]	OK	
frontPiece([6, 5]) → [6, 5]	[6, 5]	OK	
frontPiece([3, 1, 4, 1, 5]) → [3, 1]	[3, 1]	OK	
frontPiece([6]) → [6]	[6]	OK	
other tests
OK	
