
package polymorphism1;

public class Polymorphism_Lion extends Polymorphism_Animal{

    public Polymorphism_Lion(String name) {
        super(name);
    }
    //Local Methods
    void bark(){
        System.out.println(name + " is Barking");
        
    }
    //Polymorphism Methods
    public void animalSound(){
        System.out.println(name +" nag Aw Aw  ");
    }
   
   
}
