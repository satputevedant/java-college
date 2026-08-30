import java.util.Scanner;
public class OnlineShopping {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  try { System.out.print("Enter product quantity: "); int quantity=Integer.parseInt(s.nextLine());
   if(quantity<=0) throw new IllegalArgumentException("Quantity must be greater than zero.");
   System.out.println("Product quantity accepted: "+quantity);
  } catch(NumberFormatException e) { System.out.println("Invalid input. Please enter a whole number."); }
  catch(IllegalArgumentException e) { System.out.println("Invalid quantity: "+e.getMessage()); }
  finally { s.close(); }
 }
}
