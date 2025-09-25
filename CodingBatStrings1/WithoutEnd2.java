Q) Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.


withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""

Ans:

public String withouEnd2(String str) {
  if(str.length()<2){
    return "";
  }else{
  return str.substring(1, str.length()-1);
}
}

output:

withouEnd2("Hello") → "ell"	"ell"	OK	
withouEnd2("abc") → "b"	"b"	OK	
withouEnd2("ab") → ""	""	OK	
withouEnd2("a") → ""	""	OK	
withouEnd2("") → ""	""	OK	
withouEnd2("coldy") → "old"	"old"	OK	
withouEnd2("java code") → "ava cod"	"ava cod"	OK	
other tests
OK	
