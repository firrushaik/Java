Q ) Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.


sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true

Ans :

public boolean sameFirstLast(int[] nums) {
  if((nums.length >= 1) && (nums[0] == nums[nums.length-1] )){
  return true;
}
return false;
}


Output :

sameFirstLast([1, 2, 3]) → false	false	OK	
sameFirstLast([1, 2, 3, 1]) → true	true	OK	
sameFirstLast([1, 2, 1]) → true	true	OK	
sameFirstLast([7]) → true	true	OK	
sameFirstLast([]) → false	false	OK	
sameFirstLast([1, 2, 3, 4, 5, 1]) → true	true	OK	
sameFirstLast([1, 2, 3, 4, 5, 13]) → false	false	OK	
sameFirstLast([13, 2, 3, 4, 5, 13]) → true	true	OK	
sameFirstLast([7, 7]) → true	true	OK