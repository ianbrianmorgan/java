/* 
 * Copyright (C) Ian Morgan 2017 to Present
 * Code Written by Ian Morgan <ianbrianmorgan@outlook.com>
 */
package dynamicinitialization;

public class DynamicInitialization {

    public static void main(String[] args) {
        double a = 3.0, b = 4.0; //declare and initialize variables
        
        //c is dynamically initialized
        double c = Math.sqrt(a * a + b * b);
        
        System.out.println("Hypotenuse is: " + c);
        
        
    }
    
}
