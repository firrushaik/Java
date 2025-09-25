Q)Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.


nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"

Ans:

public String nonStart(String a, String b) {
  
  return a.substring(1) + b.substring(1);
}


output:

nonStart("Hello", "There") → "ellohere"	"ellohere"	OK	
nonStart("java", "code") → "avaode"	"avaode"	OK	
nonStart("shotl", "java") → "hotlava"	"hotlava"	OK	
nonStart("ab", "xy") → "by"	"by"	OK	
nonStart("ab", "x") → "b"	"b"	OK	
nonStart("x", "ac") → "c"	"c"	OK	
nonStart("a", "x") → ""	""	OK	
nonStart("kit", "kat") → "itat"	"itat"	OK	
nonStart("mart", "dart") → "artart"	"artart"	OK	
other tests
OK	
