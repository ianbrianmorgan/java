/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author Ian Morgan <ianbrianmorgan@outlook.com>
 */
public class Dog {
    int age = 1;
    int barkTimes = 4;
    String name = "Finley";
    
    void bark(int dogNumber, int barkTimes) {
        System.out.println("Dog" + dogNumber + " name is: " + name);
        System.out.println("Dog" + dogNumber + " age is: " + age);
        System.out.println("Dog" + dogNumber + " barks " + barkTimes + " time(s).");
        while (barkTimes > 0) {
            System.out.println("----Bark----");
            barkTimes--;
        }
    }
    
    void run(int dogNumber){
        System.out.println("Dog" + dogNumber + " ran.");
    }
    
    void sleep(int dogNumber) {
        System.out.println("Dog" + dogNumber + " went to sleep");
        System.out.println();
    }
}
