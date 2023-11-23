
package polymorphism1;

public class Polymorphism_Dog extends Polymorphism_Animal {
 
    public Polymorphism_Dog(String name) {
        super(name);
    }
    
    //Local Methods
    void libat(){
        System.out.println(name + " kay na Maak");
    }
    
    //polymormhism Methods
    public void animalSound(){
        System.out.println(name + " na Maak " );
    }
}
