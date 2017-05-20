/*
 * Copyright (C) Ian Morgan 2017 to Present
 * Code Written by Ian Morgan <ianbrianmorgan@outlook.com>
 */

package calcengine;

public class Calcengine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double val1 = 100.0d;
        double val2 = 50.0d;
        double result;
        char opCode = 's';
        
        if (opCode == 'a') 
            result = val1 + val2;
                    
        else if (opCode == 's')
            result = val1 - val2;
        
        else if (opCode == 'd')
            
//          Below is one way to check for divide by zero with if/then statements
//            if(val2 != 0.0d)
//                result = val1 / val2;
//            else
//                result = 0.0d;
//          Better way is in one conditional assignment
//          val2 is checked to see if it = 0, if not = 0 (?) then divide val1 by val2, otherwise (:) return 0             
            result = val2 != 0.0d ? val1 / val2 : 0.0d;
        
        else if (opCode == 'm')
            result = val1 * val2;
        
        else {
            System.out.println("Error - invalid opCode.");
            result = 0.0d;
        }
        
        System.out.println(result);
                    
    }

}
