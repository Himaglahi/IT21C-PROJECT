/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LampAndStudent;

/**
 *
 * @author PC
 */
public class Lamp {
    
     boolean is_on;

    void turnOn() {
        System.out.println("light's on!");
    }

    void turnOff() {
        System.out.println("light's off!");

    }
}
class main{
    
public static void main (String [] args){
    Lamp led = new Lamp();
    Lamp Halogen = new Lamp();
    led.turnOff();
    Halogen.turnOn();
    
}
}
