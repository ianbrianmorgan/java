/* 
 * Copyright (C) Ian Morgan 2017 to Present
 * Code Written by Ian Morgan <ianbrianmorgan@outlook.com>
 */
package ifsample;

public class IfSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y;
        
        x = 10;
        y = 20;
        
        if (x < y)
            System.out.println("x is less than y");
        
        x = x * 2;
        
        if (x==y)
            System.out.println("x is now equal to y");
        
        x = x * 2;
        
        if (x > y)
            System.out.println("x is now greater than y");
        
        if (x==y)
            System.out.println("You won't see this");        

        boolean test = false;
        if (test)
            System.out.println("Test is true");
        else
            System.out.println("Test is false");
                
    }
    
}
