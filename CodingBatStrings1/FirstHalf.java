Q) Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"


Ans:

public String firstHalf(String str) {
  
  return str.substring(0 , str.length() / 2);
  
}



output:

firstHalf("WooHoo") → "Woo"	"Woo"	OK	
firstHalf("HelloThere") → "Hello"	"Hello"	OK	
firstHalf("abcdef") → "abc"	"abc"	OK	
firstHalf("ab") → "a"	"a"	OK	
firstHalf("") → ""	""	OK	
firstHalf("0123456789") → "01234"	"01234"	OK	
firstHalf("kitten") → "kit"	"kit"	OK	
other tests
OK