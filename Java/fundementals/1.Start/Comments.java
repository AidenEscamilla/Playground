/*  #3 Comments! Programmers spend all day reading someone elses code.
 *  There are ways to format so it's easier to read, but sometimes you have to use a comment!
 *  Comments are ignored by the compiler (fancy word to learn about later), so you can write whatever you want!
 *  There are two types of comments:
 *  1. Single line comments: Anything after // is ignored by the compiler
 *  2. Multi-line comments: Anything between /* and * / is ignored by the compiler
 * 
 */
public class Comments {
  public static void main(String[] args) {
    System.out.println("Hello Java!");
    
    System.out.println("You were born in 1995");

    //Sun Microsystems announced the release of Java in 1995 (this is a single line)
    
    System.out.println("You were created by James Gosling");
    
	/*  James Gosling is a Canadian engineer who        (this is a multi-line)
	    created Java while working at Sun Microsystems. 
		His favorite number is the square root of 2!
    */
    System.out.println("You are a fun language!");
  }
} 

/*
   Summary 1-4 "I stole this from the online lesson, but it's a good summary of what we've learned so far"

    Java comments add helpful context to human readers.

    Java has whitespace, curly braces, and semicolons.
      - Whitespace is for humans to read code easily.
      - Curly braces mark the scope of a class and method.
      - Semicolons mark the end of a statement.

    Java is a compiled language.
      - Compiling catches mistakes in our code.
      - Compilers transform code into an executable class.
 */