import java.util.Scanner;
public class ATMPinVerification {
 static void verifyPin(int pin) throws Exception { if(pin!=1234) throw new Exception("Invalid PIN."); System.out.println("PIN verified successfully."); }
 public static void main(String[] args) { Scanner s=new Scanner(System.in);
  try { System.out.print("Enter ATM PIN: "); verifyPin(Integer.parseInt(s.nextLine())); }
  catch(NumberFormatException e) { System.out.println("Invalid input. PIN must contain digits only."); }
  catch(Exception e) { System.out.println("PIN verification failed: "+e.getMessage()); }
  finally { System.out.println("PIN verification process completed."); s.close(); }
 }
}
