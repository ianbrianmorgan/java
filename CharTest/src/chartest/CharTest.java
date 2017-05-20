/* 
 * Copyright (C) Ian Morgan 2017 to Present
 * Code Written by Ian Morgan <ianbrianmorgan@outlook.com>
 */
package chartest;

public class CharTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char ch1, ch2, ch3;
        char capitalC = 'C';
        
        ch1 = 88; //88 represents Unicode for X
        ch2 = 89; //89 represnts Uniocode for Y
        ch3 = 'Z';
        int formattedInt = 123_456_789; //underscores do not print out, but are helpful for readability
        
        System.out.println("Character 1 is: " + ch1);
        System.out.println("Character 2 is: " + ch2);
        System.out.println("Character 3 is: " + ch3);
        System.out.println("Formatted Int: " + formattedInt);
        System.out.println("Capital C: " + capitalC);
               
    }
    
}
