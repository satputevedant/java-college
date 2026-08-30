import java.util.Scanner;
class LicenseUnderAgeException extends Exception { LicenseUnderAgeException(String m){super(m);} }
public class DrivingLicenseSystem {
 static void checkEligibility(int age) throws LicenseUnderAgeException { if(age<18) throw new LicenseUnderAgeException("You must be at least 18 years old to get a driving license."); System.out.println("You are eligible for a driving license."); }
 public static void main(String[] args) { Scanner s=new Scanner(System.in);
  try { System.out.print("Enter your age: "); checkEligibility(Integer.parseInt(s.nextLine())); }
  catch(NumberFormatException e) { System.out.println("Invalid input. Please enter a whole number."); }
  catch(LicenseUnderAgeException e) { System.out.println("License error: "+e.getMessage()); }
  finally { s.close(); }
 }
}
