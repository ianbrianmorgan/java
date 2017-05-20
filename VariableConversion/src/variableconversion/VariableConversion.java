/* 
 * Copyright (C) Ian Morgan 2017 to Present
 * Code Written by Ian Morgan <ianbrianmorgan@outlook.com>
 */
package variableconversion;

public class VariableConversion {

    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        
        System.out.println("\nConversion of int to byte.");
        b = (byte) i; //explicity converts integer i to byte variable b
        System.out.println("Int i initialized to: " + i);
        System.out.println("Int i converted to byte: " + b); //is 1 due to division of 257/256 and throwing out the remainder
        
        System.out.println("\nConversion of double to int.");
        i = (int) d; //explicity converts double d to int variable i and truncates decimal
        System.out.println("Double d initialized to: " + d);
        System.out.println("Double d converted to int: " + i); //is 323 becuasethe .142 is thrown out with decimal to int conversion
        
        System.out.println("\nConversion of double to byte.");
        b = (byte) d; //explicity converts double d to byte variable b
        System.out.println("Double d initialized to: " + d);
        System.out.println("Double d converted to byte: " + b); //is 67 due to double losing .142 of decimal due to byte conversion
                                                                //leaving 323 and then 323 (remainder) - 256 (byte range) = 67
        
    }
    
}
