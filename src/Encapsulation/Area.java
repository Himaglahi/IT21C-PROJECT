/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author PC
 */
public class Area {
     
    int length;
        int width;
        
        Area (int length,int width){
            this.length = length;
            this.width = width;
                    
    }
    
        public void getArea(){
            int area = length+width;
            System.out.println("Area:"+area);
        }
    
}
