package gatorcash;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/** Creates bill object with payee, amount.
 *
 * @author Douglas Luman
 */
public class Bill {
  
  public final String payee;
  public final double amount;
  public final Date dueDate;
  
  /** Constructor.
   *
   * @param name Payee of bill
   * @param cost Amount of bill
   */
  public Bill(String name, double cost, String date) {
    payee = name.trim();
    amount = cost;
    dueDate = new Date(date);
  }
  
  /** Formats date in mm/dd/yy format.
   *
   */
  public String fmtDate() {
    Locale locale = Locale.getDefault();
    DateFormat fmt = DateFormat.getDateInstance(DateFormat.SHORT,locale);
    return fmt.format(dueDate);
  }
  
  /** Formats amount as currency.
   *
   */
  public String fmtAmount() {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    return fmt.format(amount);
  }
}