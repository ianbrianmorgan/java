package dynamicinitialization;

public class DynamicInitialization {

    public static void main(String[] args) {
        double a = 3.0, b = 4.0; //declare and initialize variables
        
        //c is dynamically initialized
        double c = Math.sqrt(a * a + b * b);
        
        System.out.println("Hypotenuse is: " + c);
        
        
    }
    
}
