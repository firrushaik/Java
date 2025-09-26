Q)Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".


frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true


Ans:

public boolean frontAgain(String str) {
  
  if(str.length()<2){
    return false;
  }
  
  String before = str.substring(0,2);
  String last = str.substring(str.length()-2);
  return before.equals(last);
}


output:

frontAgain("edited") → true	true	OK	
frontAgain("edit") → false	false	OK	
frontAgain("ed") → true	true	OK	
frontAgain("jj") → true	true	OK	
frontAgain("jjj") → true	true	OK	
frontAgain("jjjj") → true	true	OK	
frontAgain("jjjk") → false	false	OK	
frontAgain("x") → false	false	OK	
frontAgain("") → false	false	OK	
frontAgain("java") → false	false	OK	
frontAgain("javaja") → true	true	OK	
other tests
OK	