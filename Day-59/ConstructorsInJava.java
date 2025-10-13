When the Constructor will be called:

      When we will create the object of the class the constructer will be called.
      If we do not create the object the JVM create the default constructor dyring the runtime.

based on the para meters which constructor will be called is decided.
constructor arguments and parameters values should be match.

class can contain N number of constructor user can create.

* Whenever we create constructor . it will call only one constructor , based on the arguments we are passing.

Constructor name is same as class name. and we have to create multiple constructors.

default values:

int = 0
String = null

Creating constructor:

className(dataType1 variable1, dataType2 variable2,...){
    this.variableName = variableName;
    ..
    ..
    ..
}

Creating object:

// object name must be different while creating the multiple objects

ClassName objectName = new ClassName(values we have to pass);

System.out.println(objectName.getVariableName());
System.out.println(objectName.getVariableName());
System.out.println(objectName.getVariableName());
..
..
..
..
..


Types of Constructors:

1) No-Argument constructor

2)Default constructors

3)Parameterized constructors



