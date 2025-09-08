Q) Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.


double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false

Ans:

public boolean double23(int[] nums) {
  boolean condition = false;
  if(nums.length>=2){
    if(nums[0] == 2 && nums[1] == 2){
      condition = true;
      return condition;
    }else if(nums[0] == 3 && nums[1] == 3)  {
      condition = true;
      return condition;
    }else{
      return condition;
    }
  }
  else{
    return condition;
  }
  }

  output:

double23([2, 2]) → true	true	OK	
double23([3, 3]) → true	true	OK	
double23([2, 3]) → false	false	OK	
double23([3, 2]) → false	false	OK	
double23([4, 5]) → false	false	OK	
double23([2]) → false	false	OK	
double23([3]) → false	false	OK	
double23([]) → false	false	OK	
double23([3, 4]) → false	false	OK