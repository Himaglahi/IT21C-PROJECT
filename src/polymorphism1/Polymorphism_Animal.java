/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism1;

public class Polymorphism_Animal {

    final String name;
    
    Polymorphism_Animal(String name){
        this.name = name;
    }
    //local Methods
    void sleep(){
        System.out.println(name + " is sleeping");
    }
     void eat(){
        System.out.println(name + " is eating");
    }
     void tingong(){
        System.out.println(name + " kay saba kaayo");
    }
     //polymorphism Methods
     public void animalSound(){
         System.out.println(name + " kay libat ");
     }
     
    
    
}
