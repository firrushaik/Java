Q) Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.


sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false

Ans:

public boolean sum28(int[] nums) {
  int sum = 0;
  for(int i = 0;i<nums.length;i++){
    if(nums[i] == 2){
    sum += nums[i];
  }
  }
  
  if(sum == 8){
    return true;
  }
  else{
    return false;
  }
}


o/p:

sum28([2, 3, 2, 2, 4, 2]) → true	true	OK	
sum28([2, 3, 2, 2, 4, 2, 2]) → false	false	OK	
sum28([1, 2, 3, 4]) → false	false	OK	
sum28([2, 2, 2, 2]) → true	true	OK	
sum28([1, 2, 2, 2, 2, 4]) → true	true	OK	
sum28([]) → false	false	OK	
sum28([2]) → false	false	OK	
sum28([8]) → false	false	OK	
sum28([2, 2, 2]) → false	false	OK	
sum28([2, 2, 2, 2, 2]) → false	false	OK	
sum28([1, 2, 2, 1, 2, 2]) → true	true	OK	
sum28([5, 2, 2, 2, 4, 2]) → true	true	OK	
other tests
OK	
