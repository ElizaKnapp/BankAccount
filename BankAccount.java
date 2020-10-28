public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int ID, String pw) {
    accountID = ID;
    password = pw;
    balance = 0;
  }

  public String toString() {
    return (accountID + "\t" + balance);
  }
}
