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

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String newPass) {
    password = newPass;
  }

  public boolean deposit(double amount) {
    if (amount < 0) return false;
    else {
      balance += amount;
      return true;
    }
  }

  public boolean withdraw(double amount) {
    if (amount >= 0 && ((balance - amount) >= 0)) {
          balance = balance - amount;
          return true;
      }
    else return false;
  }

  public boolean authenticate(String password) {
    return (this.password.equals(password));
  }

  public boolean transferTo(BankAccount other, double amount, String password) {
    if (authenticate(password) && withdraw(amount)) {
      other.deposit(amount);
      return true;
    }
    else return false;
  }

}
