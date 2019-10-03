package gatorcash;

import java.text.NumberFormat;

/** Creates bill object with payee, amount.
 *
 * @author Douglas Luman
 */
public class Bill {
  
  public final String payee;
  public final double amount;
  
  /** Constructor.
   *
   * @param name Payee of bill
   * @param cost Amount of bill
   */
  public Bill(String name, double cost) {
    payee = name;
    amount = cost;
  }
  
  /** Formats amount as currency.
   *
   */
  public String fmtAmount() {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    return fmt.format(amount);
  }
}