
package polymorphism10;

public class candidateLester extends Candidate {

    String name;

    candidateLester(String name) {
        this.name = name;
    }

    public void CandidatePlacement() {
        System.out.println(name + " is left by bulang");
    }
}
