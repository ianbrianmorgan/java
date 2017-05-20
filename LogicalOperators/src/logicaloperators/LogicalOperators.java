/* 
 * Copyright (C) Ian Morgan 2017 to Present
 * Code Written by Ian Morgan <ianbrianmorgan@outlook.com>
 */
package logicaloperators;

public class LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int students = 150;
       int rooms = 0;
       
       if(rooms > 0 && students/rooms > 30)
            System.out.println("Crowded!!");
       
        System.out.println();
        System.out.println("**end program**");
    }
    
}
