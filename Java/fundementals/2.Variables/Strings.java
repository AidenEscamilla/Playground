/*  #5: Strings
 *  This is a string. It's a bunch of characters put together.
 *  A.k.a. A string of characters :P
 *  Strings are used for words, sentences, and other things that aren't numbers.
 *  
 *  Java starts to get complicated now because a String is an Object.
 *  You'll learn about Objects later, but for now just know that Strings are not a data type. 
 *  It's almost always used like a data type so it's okay to think of it that way.
 *  
 */
public class Strings {
    public static void main(String []args){
        String commonMan = "dont underestimate the power of a common man!";

        System.out.println(commonMan);

        /*  Java has a lot of special characters.
         *  There are certian characters that you can't just type into a string.
         *  Like the apostrophy in "don't" above.
         */

         String apostrophy = "don\'t underestimate me!";
         System.out.println(apostrophy);
    }
    
}
