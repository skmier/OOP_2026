package lab2.Task3;

public class BankTest {
    public static void main(String[] args) {
        Bank myBank = new Bank();

        SavingsAccount s = new SavingsAccount(1,10);
        CheckingAccount c = new CheckingAccount(2);

        myBank.openAccount(s);
        myBank.openAccount(c);
        System.out.println(c.getBalance());
        System.out.println(s.getBalance());

        s.deposit(100);
        c.deposit(400);
        System.out.println(c.getBalance());
        System.out.println(s.getBalance());
        s.withdraw(100);
        c.withdraw(200);

        System.out.println(c.getBalance());
        System.out.println(s.getBalance());

        myBank.update();

        System.out.println(c.getBalance());

        System.out.println(s.getBalance());
        s.transfer(100,c);

        System.out.println(c.getBalance());
        myBank.update();

        myBank.closeAccount(c);
        myBank.closeAccount(s);


    }
}