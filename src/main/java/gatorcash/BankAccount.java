package gatorcash;

import java.text.NumberFormat;

/** Creates and manages simple bank account.
 *
 * @author Douglas Luman
 */
public class BankAccount {

  private double balance;
  
  /** Constructor.
   *
   * @param amount Amount of starting balance
   */
  public BankAccount(double amount) {
    balance = amount;
  }
  
  /** Handles credits.
   *
   * @param amount Amount to credit
   */
  public void credit(double amount) {
    balance += amount;
  }
  
  /** Handles debits.
   *
   * @param amount Amount to debit
   */
  public void debit(double amount) {
    balance -= amount;
  }
  
  /** Returns balance as string.
   *
   */
  public String getBalance() {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    return fmt.format(balance);
  }
}