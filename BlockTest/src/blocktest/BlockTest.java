/* 
 * Copyright (C) Ian Morgan 2017 to Present
 * Code Written by Ian Morgan <ianbrianmorgan@outlook.com>
 */
package blocktest;

public class BlockTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x, y;
        
        y = 20;
        //the target of this loop is a block
        for(x=0; x < 5; x++) {
            System.out.println("This is x: " + x);
            System.out.println("This is y: " + y);
            y = y -2;
            
        }
            
    }
    
}
