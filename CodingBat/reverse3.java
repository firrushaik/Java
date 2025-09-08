Q) Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]

Ans:

public int[] reverse3(int[] nums) {
int[] newArr = new int[3];
    int mid = 0+(nums.length-1) / 2;
       newArr[0] =nums[mid+1];
       newArr[1] = nums[mid];
       newArr[2] =nums[mid-1];
       return newArr;
  }

Output:

reverse3([1, 2, 3]) → [3, 2, 1]	[3, 2, 1]	OK	
reverse3([5, 11, 9]) → [9, 11, 5]	[9, 11, 5]	OK	
reverse3([7, 0, 0]) → [0, 0, 7]	[0, 0, 7]	OK	
reverse3([2, 1, 2]) → [2, 1, 2]	[2, 1, 2]	OK	
reverse3([1, 2, 1]) → [1, 2, 1]	[1, 2, 1]	OK	
reverse3([2, 11, 3]) → [3, 11, 2]	[3, 11, 2]	OK	
reverse3([0, 6, 5]) → [5, 6, 0]	[5, 6, 0]	OK	
reverse3([7, 2, 3]) → [3, 2, 7]	[3, 2, 7]	OK	
other tests
OK	
