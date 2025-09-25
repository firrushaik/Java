Q) Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"

Ans:

public String middleThree(String str) {
  int mid = str.length() / 2;
  
  return str.substring(mid-1 , mid+2);
}


output:

middleThree("Candy") → "and"	"and"	OK	
middleThree("and") → "and"	"and"	OK	
middleThree("solving") → "lvi"	"lvi"	OK	
middleThree("Hi yet Hi") → "yet"	"yet"	OK	
middleThree("java yet java") → "yet"	"yet"	OK	
middleThree("Chocolate") → "col"	"col"	OK	
middleThree("XabcxyzabcX") → "xyz"	"xyz"	OK	
other tests
OK	
