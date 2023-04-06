package exception;

public class Age_Custom_Exception {
    public String VotingEligibility(int age) throws Custom_exception{
        if(age<18) {
            throw new Custom_exception("You are not eligible");
        }
        else {
            return "Welcome to Voting System";
        }
    }
    public static void main(String[] args) {
        Age_Custom_Exception obj = new Age_Custom_Exception();
        try {
            System.out.println(obj.VotingEligibility(13));
        }
        catch (Custom_exception e) {
            e.printStackTrace();
        }
    }
}
