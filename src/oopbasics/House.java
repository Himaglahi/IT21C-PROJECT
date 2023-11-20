/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopbasics;

/**
 *
 * @author PC
 */
public class House {
    
     String house_name;
   double car_price;
    private final double house_price;
    
   House(String car_name,double house_price){
        this.house_name = house_name;
        this.house_price = house_price;
}     
    void HouseMode(){
        System.out.println(house_name + "is a nice house");
    }
    void HousePrice(){
        System.out.println(house_price + "is grabi ka mahal!");
    }
}
