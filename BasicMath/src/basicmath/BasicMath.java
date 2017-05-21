/*
 * Copyright (C) Ian Morgan 2017 to Present
 * Code Written by Ian Morgan <ianbrianmorgan@outlook.com>
 */

package basicmath;

public class BasicMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Arithmetic using integers");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        int modulusInt = (int) 42 % 10;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("int modulus 42 % 10 = " + modulusInt);
        
        System.out.println("\nArithmetic using doubles");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - da;
        double de = -dd;
        double modulusDouble = (double) 42.25 % 10;
        
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);
        System.out.println("double modulus 42.25 % 10 = " + modulusDouble);
        
        System.out.println("\nUsing Assignments");
        int x = 1;
        int y = 2;
        int z = 3;
        char ascii = 50; //uses ascii value and 50 = the number 2
        
        x += 5;
        y *= 4;
        z += x * y;
        z %= 6;
        ascii += 23; //adds 23 to the ascii value 50, giving 73, which is the letter I
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("char (ASCII) assignment = " + ascii);
        
        System.out.println("\nIncrement and Decerement");
        
        System.out.println("\n--Increment before assignment");
        int l = 42;
        
        System.out.println("l: " + l);
        
        int m = ++l; //l is incremented before l is assigned to m
        System.out.println("m: " + m);
        
        System.out.println("\n--Increment after assignment");
        int n = 42;
        
        System.out.println("n: " + n);
        
        int o = n++; //n is incremented after n is assigned to o
        System.out.println("o: " + o);
        
    }

}
