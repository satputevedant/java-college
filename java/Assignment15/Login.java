import java.util.Scanner;
public class Login {
 static void validatePassword(String p) throws Exception { if(!"java123".equals(p)) throw new Exception("Invalid password."); System.out.println("Login successful."); }
 public static void main(String[] args) { Scanner s=new Scanner(System.in);
  try { System.out.print("Enter password: "); validatePassword(s.nextLine()); }
  catch(Exception e) { System.out.println("Login failed: "+e.getMessage()); }
  finally { System.out.println("Login process completed."); s.close(); }
 }
}
