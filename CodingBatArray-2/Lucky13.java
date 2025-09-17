Q) Given an array of ints, return true if the array contains no 1's and no 3's.


lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false

Ans:

public boolean lucky13(int[] nums) {
  boolean isFound = false;
  for(int i = 0;i<nums.length;i++){
    if(nums[i]==1 || nums[i]==3){
      return isFound;
    }
  }
  
  return true;
  
}


output:

lucky13([0, 2, 4]) → true	true	OK	
lucky13([1, 2, 3]) → false	false	OK	
lucky13([1, 2, 4]) → false	false	OK	
lucky13([2, 7, 2, 8]) → true	true	OK	
lucky13([2, 7, 1, 8]) → false	false	OK	
lucky13([3, 7, 2, 8]) → false	false	OK	
lucky13([2, 7, 2, 1]) → false	false	OK	
lucky13([1, 2]) → false	false	OK	
lucky13([2, 2]) → true	true	OK	
lucky13([2]) → true	true	OK	
lucky13([3]) → false	false	OK	
lucky13([]) → true	true	OK	