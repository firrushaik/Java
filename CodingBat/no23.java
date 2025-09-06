Q ) Given an int array length 2, return true if it does not contain a 2 or 3.


no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false

Ans:

public boolean no23(int[] nums) {
  if(((nums[0] != 2) && (nums[1] != 2)) && ((nums[0] != 3) && (nums[1] != 3))){
    return true;
  }
  else{
    return false;
  }
}


Output:

no23([4, 5]) → true	true	OK	
no23([4, 2]) → false	false	OK	
no23([3, 5]) → false	false	OK	
no23([1, 9]) → true	true	OK	
no23([2, 9]) → false	false	OK	
no23([1, 3]) → false	false	OK	
no23([1, 1]) → true	true	OK	
no23([2, 2]) → false	false	OK	
no23([3, 3]) → false	false	OK	
no23([7, 8]) → true	true	OK	
no23([8, 7]) → true	true	OK