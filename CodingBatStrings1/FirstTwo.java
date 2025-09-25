Q) Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.


firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"

Ans:

public String firstTwo(String str) {
  
  if(str.length()<2){
    return str;
  }
  return str.substring(0,2);
}


output:

firstTwo("Hello") → "He"	"He"	OK	
firstTwo("abcdefg") → "ab"	"ab"	OK	
firstTwo("ab") → "ab"	"ab"	OK	
firstTwo("a") → "a"	"a"	OK	
firstTwo("") → ""	""	OK	
firstTwo("Kitten") → "Ki"	"Ki"	OK	
firstTwo("hi") → "hi"	"hi"	OK	
firstTwo("hiya") → "hi"	"hi"	OK	
other tests
OK	
