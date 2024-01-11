/*  #4: Characters
 *  A character is a single letter, number, space, or symbol.
 *  Java is REALLY picky about characters. You have to use single quotes!
 *  You can't use double quotes, or it will think you're trying to use a string (you'll learn about strings soon).
 *  
 *  To declare a character, type "char" and then the name of the variable.
 *  Make sure you use single quotes!
 *  
 */
public class Characters {
    public static void main(String []args){
        // char variable declaration (making it exist)
        char grade;

        // assignment (giving it a value) SINGLE QUOTES!
        grade = 'A';
        char gradeOutOf10 = '7';

        // And now we can use it! We can print our variable like this
        System.out.println("Printing grade: " + grade); 

        System.out.println("Printing gradeOutOf10: " + gradeOutOf10); 
        //^^ This is the charact '7' not the number 7. It's a character, not an integer
    }
}
