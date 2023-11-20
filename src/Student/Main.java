/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

/**
 *
 * @author PC
 */
public class Main {
    
     public static void main(String [] args){
    
   Student student = new Student();
    student.setName("Mj Magsalos");
     student.setSection("it21C");
     student.setMotto("Happiness is not by Chance but by Choice ");
    
    
    
        System.out.println("Name: "+ student.name);
        System.out.println("Section: "+ student.section);
        System.out.println("Motto: "+ student.motto);
    
    }    
    
    
}
