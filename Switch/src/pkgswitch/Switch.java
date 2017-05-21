/*
 * Copyright (C) Ian Morgan 2017 to Present
 * Code Written by Ian Morgan <ianbrianmorgan@outlook.com>
 */

package pkgswitch;

public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iVal = 10;
        
        switch(iVal % 2){
            case 0:
                System.out.print(iVal);
                System.out.println(" is even.");
                break;
            case 1:
                System.out.print(iVal);
                System.out.println(" is odd.");
                break;
            default:
                System.out.println("Oops! Something broke!");
                break;
        }
    }

}
