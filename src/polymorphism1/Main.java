
package polymorphism1;

public class Main {
    
    public static void main(String [] args){
        Polymorphism_Animal my_animal = new Polymorphism_Animal ("MJ");
        Polymorphism_Lion my_lion = new Polymorphism_Lion ("king mj");
        Polymorphism_Dog my_dog = new Polymorphism_Dog ("Libat");
        
        //local Methods
        my_animal.sleep();
        my_animal.tingong();
        my_animal.eat();
        
        System.out.println("-----------------");
        //Polymorphism
        my_animal.animalSound();
        my_lion.animalSound();
        my_dog.animalSound();
        
    }
    
    
}
