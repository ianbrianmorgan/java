/*
 * Copyright (C) Ian Morgan 2017 to Present
 * Code Written by Ian Morgan <ianbrianmorgan@outlook.com>
 */

package dowhile;

public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //always executes at least one
        int iVal = 5;
        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while(iVal < 100);
    }

}
