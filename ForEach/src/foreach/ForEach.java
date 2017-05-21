/*
 * Copyright (C) Ian Morgan 2017 to Present
 * Code Written by Ian Morgan <ianbrianmorgan@outlook.com>
 */

package foreach;

public class ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[] theVals = { 10.0f, 20.0f, 15.0f };
        float sum = 0.0f;
        
        for(float currentVal : theVals) {
            sum += currentVal;
            System.out.println(sum);
        }
    }

}
