Q) Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.


maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]

ans:


public int[] maxEnd3(int[] nums) {
  int max = Integer.MIN_VALUE;
  if(nums[0]>nums[nums.length-1]){
    max = nums[0];
  }
  else{
    max=nums[nums.length-1];
  }
  for(int i = 0 ; i<nums.length;i++){
    nums[i] = max;
  }
  return nums;
  }


Output:

maxEnd3([1, 2, 3]) → [3, 3, 3]	[3, 3, 3]	OK	
maxEnd3([11, 5, 9]) → [11, 11, 11]	[11, 11, 11]	OK	
maxEnd3([2, 11, 3]) → [3, 3, 3]	[3, 3, 3]	OK	
maxEnd3([11, 3, 3]) → [11, 11, 11]	[11, 11, 11]	OK	
maxEnd3([3, 11, 11]) → [11, 11, 11]	[11, 11, 11]	OK	
maxEnd3([2, 2, 2]) → [2, 2, 2]	[2, 2, 2]	OK	
maxEnd3([2, 11, 2]) → [2, 2, 2]	[2, 2, 2]	OK	
maxEnd3([0, 0, 1]) → [1, 1, 1]	[1, 1, 1]	OK	
other tests
OK