public class BankTester {
  public static void main(String[] args) {

  //for testing the constructor
    BankAccount t1 = new BankAccount(3284, "snailbob");
    System.out.println(t1);
    System.out.println(t1.getBalance()); //0
    System.out.println(t1.getAccountID()); //3284

    System.out.println(t1.deposit(-8.34)); //false
    System.out.println(t1.getBalance()); //0

    System.out.println(t1.deposit(8.34)); //true
    System.out.println(t1.getBalance()); //8.34

    System.out.println(t1.deposit(0)); //true
    System.out.println(t1.getBalance()); //8.34

    System.out.println(t1.withdraw(-19)); //false
    System.out.println(t1.getBalance()); //8.34

    System.out.println(t1.withdraw(19)); //false
    System.out.println(t1.getBalance()); //8.34

    System.out.println(t1.withdraw(8)); //true
    System.out.println(t1.getBalance()); //0.34

    System.out.println(t1.withdraw(0)); //true
    System.out.println(t1.getBalance()); //0.34

  }
}
