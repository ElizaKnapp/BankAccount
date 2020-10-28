public class BankTester {
  public static void main(String[] args) {
    BankAccount t1 = new BankAccount(3284, "snailbob");
    System.out.println(t1);

    System.out.println(t1.getBalance());
    System.out.println(t1.getAccountID());

    t1.setPassword("843593"); //how do you get this to print the password
  }
}
