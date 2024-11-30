import java.util.*;
class Candidate {
    String name;
    int votes;
    Candidate prev;
    Candidate next;

    public Candidate(String name) {
        this.name = name;
        this.votes = 0;
        this.prev = null;
        this.next = null;
    }
}

class Voter {
    String id;
    boolean hasVoted;
    Voter prev;
    Voter next;

    public Voter(String id) {
        this.id = id;
        this.hasVoted = false;
        this.prev = null;
        this.next = null;
    }
}

public class VotingSystem {
    private Candidate headCandidate;
    private Voter headVoter;

    public VotingSystem() {
        headCandidate = null;
        headVoter = null;
    }

    public void addCandidate(String name) {
        Candidate newCandidate = new Candidate(name);
        if (headCandidate == null) {
            headCandidate = newCandidate;
        } else {
            Candidate current = headCandidate;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newCandidate;
            newCandidate.prev = current;
        }
    }

    public void addVoter(String id) {
        Voter newVoter = new Voter(id);
        if (headVoter == null) {
            headVoter = newVoter;
        } else {
            Voter current = headVoter;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newVoter;
            newVoter.prev = current;
        }
    }

    public void vote(String voterId, String candidateName) {
        Voter voter = findVoter(voterId);
        if (voter != null && !voter.hasVoted) {
            Candidate candidate = findCandidate(candidateName);
            if (candidate != null) {
                candidate.votes++;
                voter.hasVoted = true;
                System.out.println("Vote counted successfully.");
            } else {
                System.out.println("Candidate not found.");
            }
        } else {
            System.out.println("Invalid voter or voter has already voted.");
        }
    }

    private Voter findVoter(String id) {
        Voter current = headVoter;
        while (current != null) {
            if (current.id.equals(id)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    private Candidate findCandidate(String name) {
        Candidate current = headCandidate;
        while (current != null) {
            if (current.name.equals(name)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void displayResults() {
        System.out.println("Election Results:");
        Candidate current = headCandidate;
        while (current != null) {
            System.out.println(current.name + ": " + current.votes + " votes");
            current = current.next;
        }
    }
    
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Online Voting System");
        votingSystem.addCandidate("Candidate 1");
        votingSystem.addCandidate("Candidate 2");
        System.out.println("Enter Number of voter you want add");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
             int attempts=0;
        int max_attempts=3;
      while(attempts<=max_attempts){
        System.out.println("Enter your Name");
        String Vname=sc.next();
        System.out.println("Enter Mobile number");
        String Vmobile=sc.next();
        if(Vmobile.length()==10 && Vmobile.startsWith("9")){
            System.out.println("Login successful! Welcome "+Vname);
           votingSystem.addVoter(Vname);
            System.out.println("1) Candidate 1");
            System.out.println("2) Candidate 2");
            System.out.println("Choose your operation");
            int ch=sc.nextInt();
            if(ch==1){
                 votingSystem.vote(Vname, "Candidate 1");
            }else{
 votingSystem.vote(Vname, "Candidate 2"); 
            }
            break;       
        }else{
            System.out.println("Invalid mobile number format. Login failed.");
            attempts++;
            int left=max_attempts-attempts;
            System.out.println("Attempts left="+left);
        }
        if(attempts==3){
            System.out.println("Maximum login attempts reached. Access denied.");
            System.exit(0);
        }
    }
           

        }
       
       

        votingSystem.displayResults();
    }
}
