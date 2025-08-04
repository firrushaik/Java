Comments : Comments in java are non-executable statement within the source code that are ignored by the java compiler. 
The primary purpose is to write comments are to provide explanation,documentation about the code for human readers, such as developers working on the project.

There are three types of comments in java :

Single line comments
Multi line comments
Documentation comments

Single line comment : These comments start with two forward slashes ( // ). These is used to comment the single line code .
This is used to comment the single line of code.

eg: int year = 2025; // Declare and Initilize a  integer variable year

Multi line comment : These comments start with /* and ends with */ .
This is used to comment the multiple lines , text , or blocks of the code .

eg: class Abc{
   /* public static void main(String[] args){
        System.out.println(); 
    } */
}

Documentation comments : These comments starts with /** and ends with */ . 
They are used to generate API documentation using the javadoc tool.

eg: class Abc{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        /** This method calculates the sum of two integers.
         * a is the first integer.
         * b is the second integer.
         * return the sum of a and b.
         */
        int sum = a + b;
        System.out.println(sum);
    }
}


