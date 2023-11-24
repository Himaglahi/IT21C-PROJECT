
package polymorphism10;

public class candidateJosip extends Candidate {
    String name;
     
    candidateJosip(String name){
        this.name = name;
    }
     
     public void CandidatePlacement(){
        System.out.println( name +" is leading");
     }
}
