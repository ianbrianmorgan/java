
package arraylistexample;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> myColors = new ArrayList<>();
        
        myColors.add("blue");
        myColors.add("red");
        myColors.add("green");
        myColors.add("pink");
        myColors.add("black");
        
        System.out.println("My Colors ArrayList contains: " + myColors);
        System.out.println("My Colors ArrayList size is: " +myColors.size());
        
        ArrayList<Integer> myNumbers = new ArrayList<>();
        
        int i = 0;
        for(i=0;i<10;i++){
            myNumbers.add(i);
        }
        System.out.println();
        System.out.println("My Numbers ArrayList contains: " + myNumbers);
        System.out.println("My Numbers ArrayList size is: " + myNumbers.size());
        
        myColors.clear();
        System.out.println();
        System.out.println("My Colors ArrayList is cleared and contains: " + myColors + " elements.");
    }
    
}
