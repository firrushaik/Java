Q) Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).


comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"

Ans:

public String comboString(String a, String b) {
  
  if(a.length() > b.length()){
    return b + a + b;
  }else{
    return a + b + a;
  }
}


output:

comboString("Hello", "hi") → "hiHellohi"	"hiHellohi"	OK	
comboString("hi", "Hello") → "hiHellohi"	"hiHellohi"	OK	
comboString("aaa", "b") → "baaab"	"baaab"	OK	
comboString("b", "aaa") → "baaab"	"baaab"	OK	
comboString("aaa", "") → "aaa"	"aaa"	OK	
comboString("", "bb") → "bb"	"bb"	OK	
comboString("aaa", "1234") → "aaa1234aaa"	"aaa1234aaa"	OK	
comboString("aaa", "bb") → "bbaaabb"	"bbaaabb"	OK	
comboString("a", "bb") → "abba"	"abba"	OK	
comboString("bb", "a") → "abba"	"abba"	OK	
comboString("xyz", "ab") → "abxyzab"	"abxyzab"	OK	
other tests
Ok


