/*
 * Copyright (C) Ian Morgan 2017 to Present
 * Code Written by Ian Morgan <ianbrianmorgan@outlook.com>
 */

package arrays2;

public class Arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        int x = 10;
        int values[] = {1,2,3,4,5,6,7,8,9,10};
        
        for(i = 0; i < 10; i++) {
            values[i] *= x++;
            //System.out.println("Array value is: " + values[i]);
        }
        
        for (i=0; i < values.length; i++)
            System.out.println(" Array value is: " + values[i]);

    }
}
