Q ) Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"


Ans:

public String helloName(String name) {
  
  return "Hello " + name + "!" ;
}


output:

helloName("Bob") → "Hello Bob!"	"Hello Bob!"	OK	
helloName("Alice") → "Hello Alice!"	"Hello Alice!"	OK	
helloName("X") → "Hello X!"	"Hello X!"	OK	
helloName("Dolly") → "Hello Dolly!"	"Hello Dolly!"	OK	
helloName("Alpha") → "Hello Alpha!"	"Hello Alpha!"	OK	
helloName("Omega") → "Hello Omega!"	"Hello Omega!"	OK	
helloName("Goodbye") → "Hello Goodbye!"	"Hello Goodbye!"	OK	
helloName("ho ho ho") → "Hello ho ho ho!"	"Hello ho ho ho!"	OK	
helloName("xyz!") → "Hello xyz!!"	"Hello xyz!!"	OK	
helloName("Hello") → "Hello Hello!"	"Hello Hello!"	OK	
other tests
OK	
