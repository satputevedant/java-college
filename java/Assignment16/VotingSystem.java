import java.util.Scanner;
class UnderAgeException extends Exception { UnderAgeException(String m){super(m);} }
public class VotingSystem {
 static void checkEligibility(int age) throws UnderAgeException { if(age<18) throw new UnderAgeException("You must be at least 18 years old to vote."); System.out.println("You are eligible to vote."); }
 public static void main(String[] args) { Scanner s=new Scanner(System.in);
  try { System.out.print("Enter your age: "); checkEligibility(Integer.parseInt(s.nextLine())); }
  catch(NumberFormatException e) { System.out.println("Invalid input. Please enter a whole number."); }
  catch(UnderAgeException e) { System.out.println("Voting error: "+e.getMessage()); }
  finally { s.close(); }
 }
}
