Q) Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".


makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"

Ans:

public String makeAbba(String a, String b) {
  return a.concat(b) + b.concat(a);
  
}


output:

makeAbba("Hi", "Bye") → "HiByeByeHi"	"HiByeByeHi"	OK	
makeAbba("Yo", "Alice") → "YoAliceAliceYo"	"YoAliceAliceYo"	OK	
makeAbba("What", "Up") → "WhatUpUpWhat"	"WhatUpUpWhat"	OK	
makeAbba("aaa", "bbb") → "aaabbbbbbaaa"	"aaabbbbbbaaa"	OK	
makeAbba("x", "y") → "xyyx"	"xyyx"	OK	
makeAbba("x", "") → "xx"	"xx"	OK	
makeAbba("", "y") → "yy"	"yy"	OK	
makeAbba("Bo", "Ya") → "BoYaYaBo"	"BoYaYaBo"	OK	
makeAbba("Ya", "Ya") → "YaYaYaYa"	"YaYaYaYa"	OK	
other tests
OK	
