Q) Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.


extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"


Ans:

public String extraEnd(String str) {
  String lastTwo = str.substring(str.length() -2);
  
  return lastTwo + lastTwo + lastTwo;
}


output:

extraEnd("Hello") → "lololo"	"lololo"	OK	
extraEnd("ab") → "ababab"	"ababab"	OK	
extraEnd("Hi") → "HiHiHi"	"HiHiHi"	OK	
extraEnd("Candy") → "dydydy"	"dydydy"	OK	
extraEnd("Code") → "dedede"	"dedede"	OK	
other tests
OK	