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
    BankAccount account = new BankAccount(startingBalance);
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
    String date = scanner.next();
    String payee = scanner.nextLine();
    // Create bill
    Bill bill = new Bill(payee,amount,date);
    // Transact account business
    account.debit(bill.amount);
    // Display final balance
    System.out.print("Subtracting a " + bill.fmtAmount() + " bill from " + bill.payee 
                     + " (payable on " + bill.fmtDate() + ") you have: " + account.getBalance());
  }
}