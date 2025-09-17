Q) Given an array of ints, return true if the number of 1's is greater than the number of 4's


more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true

Ans:

public boolean more14(int[] nums) {
  int onesCount = 0;
  int foursCount = 0;
  
  for(int i = 0;i<nums.length;i++){
    if(nums[i] == 1){
      onesCount++;
    }
    if(nums[i] == 4){
      foursCount++;
    }
  }
  
  if(onesCount > foursCount){
    return true;
  }
  else{
    return false;
} 
}


o/p:

more14([1, 4, 1]) → true	true	OK	
more14([1, 4, 1, 4]) → false	false	OK	
more14([1, 1]) → true	true	OK	
more14([1, 6, 6]) → true	true	OK	
more14([1]) → true	true	OK	
more14([1, 4]) → false	false	OK	
more14([6, 1, 1]) → true	true	OK	
more14([1, 6, 4]) → false	false	OK	
more14([1, 1, 4, 4, 1]) → true	true	OK	
more14([1, 1, 6, 4, 4, 1]) → true	true	OK	
more14([]) → false	false	OK	
more14([4, 1, 4, 6]) → false	false	OK	
more14([4, 1, 4, 6, 1]) → false	false	OK	
more14([1, 4, 1, 4, 1, 6]) → true	true	OK	
other tests
OK	
