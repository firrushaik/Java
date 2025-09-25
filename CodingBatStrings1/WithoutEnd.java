Q) Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.


withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"

Ans:

public String withoutEnd(String str) {
  return str.substring(1 , str.length()-1);
}


Output:

withoutEnd("Hello") → "ell"	"ell"	OK	
withoutEnd("java") → "av"	"av"	OK	
withoutEnd("coding") → "odin"	"odin"	OK	
withoutEnd("code") → "od"	"od"	OK	
withoutEnd("ab") → ""	""	OK	
withoutEnd("Chocolate!") → "hocolate"	"hocolate"	OK	
withoutEnd("kitten") → "itte"	"itte"	OK	
withoutEnd("woohoo") → "ooho"	"ooho"	OK	
other tests
OK