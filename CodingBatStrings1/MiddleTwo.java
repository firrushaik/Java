Q) Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.


middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"

Ans:

public String middleTwo(String str) {
  int mid = str.length() / 2;
  return str.substring( mid-1 , mid+1);
  
}


output:

middleTwo("string") → "ri"	"ri"	OK	
middleTwo("code") → "od"	"od"	OK	
middleTwo("Practice") → "ct"	"ct"	OK	
middleTwo("ab") → "ab"	"ab"	OK	
middleTwo("0123456789") → "45"	"45"	OK	
other tests
OK	