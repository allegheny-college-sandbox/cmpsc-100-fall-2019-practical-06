package gatorcash;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Handles account and a single debit.
 *
 * @author Douglas Luman
 */
public class GatorAccount {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Get balanace from command line arguments
    double startingBalance = Double.parseDouble(args[0]);
    // Set up BankAccount
    BankAccount gatorAccount = new BankAccount(startingBalance);
    // Declare file and scanner objects.
    File billFile = null;
    Scanner scanner = null;
    try {
      billFile = new File("inputs/bills.txt");
      scanner = new Scanner(billFile);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    // Gather data
    double amount = scanner.nextDouble();
    String payee = scanner.nextLine();
    // Create bill
    Bill hatBill = new Bill(payee,amount);
    // Transact account business
    gatorAccount.debit(hatBill.amount);
    // Display final balance
    System.out.print("Subtracting a " + hatBill.fmtAmount() + " bill from " + hatBill.payee 
                     + " you have: " + gatorAccount.getBalance());
  }
}