Q)Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.


lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"

Ans:

public String lastChars(String a, String b) {
  char first = a.length()>0?a.charAt(0): '@';
  char last = b.length()>0?b.charAt(b.length()-1): '@';
  return "" + first + last;
}


output:

lastChars("last", "chars") → "ls"	"ls"	OK	
lastChars("yo", "java") → "ya"	"ya"	OK	
lastChars("hi", "") → "h@"	"h@"	OK	
lastChars("", "hello") → "@o"	"@o"	OK	
lastChars("", "") → "@@"	"@@"	OK	
lastChars("kitten", "hi") → "ki"	"ki"	OK	
lastChars("k", "zip") → "kp"	"kp"	OK	
lastChars("kitten", "") → "k@"	"k@"	OK	
lastChars("kitten", "zip") → "kp"	"kp"	OK	
other tests
OK	
