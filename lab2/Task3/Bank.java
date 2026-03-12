package lab2.Task3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts = new Vector<>();

    public void update(){
        for (Account a : accounts){
            if (a instanceof SavingsAccount){
                SavingsAccount s = (SavingsAccount) a;
                s.getInterestRate();
            }
            else if (a instanceof CheckingAccount){
                CheckingAccount c = (CheckingAccount) a;
                c.deductFee();
            }
        }
    }

    public void openAccount(Account acc){
        accounts.add(acc);
    }

    public void closeAccount(Account acc){
        if(accounts.contains(acc)){
            accounts.remove(acc);
        }
    }

    public Vector<Account> getAccounts() {
        return accounts;
    }

}
