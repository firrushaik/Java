Escape Sequences : An escape sequences in java is a combination of charecter starting with a backslash(\) just before it is an escape sequences or escape character.

We use escape sequences to perform some specific task.

In java , there are 8 types of escape sequences. They are listed below:

\t = insert a tab

\b = insert a back space

\n = insert a new line

\r = carriage return.()

\f = form feed

\' = insert a single quote

\" = insert a double quote

\\ = insert a backlslash

Example :

class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Hello\tWorld!"); // it adds a tab space
        System.out.println("Hello\nWorld"); // \n adds a new line
        System.out.println("she said, \"Hello!\""); //prints double quotes
        System.out.println("Backslash:\\"); // prints a backslash
        System.out.println("It\'s java!"); // it adds single quote to the word
        System.out.println("hello\rguys"); // it  removes entire sentence before the escape sequence
        System.out.println("hello\fbuddy"); // it adds some empty emoji
        System.out.println("hello\b buddy"); //it removes the backword before escapesequences

    }
} 

output :

Hello	World!
Hello
World
she said, "Hello!"
Backslash:\
It's java!
guys
hellobuddy
hell buddy



