Q)
Given a string, return true if it ends in "ly".


endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false

Ans:

public boolean endsLy(String str) {
  return str.endsWith("ly");
}


output:

endsLy("oddly") → true	true	OK	
endsLy("y") → false	false	OK	
endsLy("oddy") → false	false	OK	
endsLy("oddl") → false	false	OK	
endsLy("olydd") → false	false	OK	
endsLy("ly") → true	true	OK	
endsLy("") → false	false	OK	
endsLy("falsey") → false	false	OK	
endsLy("evenly") → true	true	OK	
other tests
OK	