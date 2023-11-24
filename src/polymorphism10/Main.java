
package polymorphism10;

public class Main {
    

    public static void main(String[] args) {
       Candidate candidate = new Candidate();
       
       candidateMj mj = new candidateMj ("mj");
       candidateJosip josip = new candidateJosip ("Josip");
       candidateLester lester = new candidateLester ("Lester");
       
       candidate.CandidatePlacement();
       josip.CandidatePlacement();
       lester.CandidatePlacement();
       mj.CandidatePlacement();
    }

}
