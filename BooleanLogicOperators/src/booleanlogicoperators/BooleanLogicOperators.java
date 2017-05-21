/*
 * Copyright (C) Ian Morgan 2017 to Present
 * Code Written by Ian Morgan <ianbrianmorgan@outlook.com>
 */

package booleanlogicoperators;

public class BooleanLogicOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Basic Boolean Operators");
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = b | a;
        boolean e = a & b;
        boolean f = b & a;
        boolean g = a ^ b;
        boolean h = b ^ a;
        boolean i = (!a & b) | (a & !b);
        boolean j = !a;
        
        System.out.println("                   a = " + a);
        System.out.println("                   b = " + b);
        System.out.println("                 a|b = " + c);
        System.out.println("                 b|a = " + d);
        System.out.println("                 a&b = " + e);
        System.out.println("                 b&a = " + f);
        System.out.println("                 a^b = " + g);
        System.out.println("                 b^a = " + h);
        System.out.println(" (!a & b) | (a & !b) = " + i);
        System.out.println("                  !a = " + j);
        
        System.out.println("\nShort Circuit Operators");
        double numerator = 100.0;
        double denominator = 0.0;
        
        if(denominator > 0 && numerator / denominator > 10) //short-circuit if left side of test fails (right doesn't execute at all)
                                                            //right side depends on the left to work--in this case, left side cannot
                                                            //divide by zero, so don't execute it if left test yields zero in denominator
            System.out.println("This worked");
        else
            System.out.println("Denominator was zero so we bailed and didn't try to divide by zero.");
        
        System.out.println("\nThe ? Operator");
        double ratio;
        double num = 100;
        double denom = 10;
        
        ratio = denom == 0 ? 0 : num / denom; //denom == 0 is evaluated. If true, then ratio is assigned 0. Else num/denom happens.
        
        if(ratio == 0)
            System.out.println("The test for denominator equals zero is true. Denominator is: " + ratio);
        else
            System.out.println("Denominator is not zero. The ratio is " + ratio);
    }

}
