/* 
 * Copyright (C) Ian Morgan 2017 to Present
 * Code Written by Ian Morgan <ianbrianmorgan@outlook.com>
 */
package example;

public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        int dogNumber;
        int barkTimes;
        
        dogNumber = 1;
        barkTimes = dogNumber;
        dog1.age = 7;
        dog1.name = "Chester";
        dog1.bark(dogNumber,barkTimes);
        dog1.run(dogNumber);
        dog1.sleep(dogNumber);
        //System.out.println("Dog1 name is: " + dog1.name + " and age is: " + dog1.age);
        
        Dog dog2 = new Dog();
        
        dogNumber = 2;
        barkTimes = dogNumber;
        dog2.age = 14;
        dog2.name = "Piper";
        dog2.bark(dogNumber,barkTimes);
        dog2.run(dogNumber);
        dog2.sleep(dogNumber);
        //System.out.println("Dog2 name is: " + dog2.name + " and age is: " + dog2.age);
        
        Dog dog3 = new Dog();
        
        dogNumber = 3;
        barkTimes = dogNumber;
        dog3.age = 17;
        dog3.name = "Dootsie";
        dog3.bark(dogNumber,barkTimes);
        dog3.run(dogNumber);
        dog3.sleep(dogNumber);
        //System.out.println("Dog2 name is: " + dog2.name + " and age is: " + dog2.age);
        
        Dog dog4 = new Dog();
        
        dogNumber = 4;
        barkTimes = dogNumber;
        //dog2.age = 14;
        //dog2.name = "Piper";
        dog4.bark(dogNumber,barkTimes);
        dog4.run(dogNumber);
        dog4.sleep(dogNumber);
        
        NumberMultiplier numberMultiplier = new NumberMultiplier();
        
        int numberMultiply;
        numberMultiply = numberMultiplier.numberMultiply(500, 400);
        
        System.out.println("Number Multiply Result = " + numberMultiply);
        
    }

    
}