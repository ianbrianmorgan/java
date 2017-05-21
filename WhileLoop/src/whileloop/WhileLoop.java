/*
 * Copyright (C) Ian Morgan 2017 to Present
 * Code Written by Ian Morgan <ianbrianmorgan@outlook.com>
 */

package whileloop;

public class WhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kVal = 6;
        int factorial = 1;
        
        //conditon checked at begining of each loop
        while(kVal > 1) {
            factorial *= kVal--;
            System.out.println("Factorial: " + factorial + "\t\tkVal Counter: " + kVal);
        }
    }

}
