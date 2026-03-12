package lab2.Task3;

public class Account {
    protected double balance;
    private int accNumber;

    public Account(int accNum) {
        this.balance = 0.0;
        this.accNumber = accNumber;
    }

    public void deposit(double sum){
        if(sum > 0){
            balance+=sum;
        } else {
            System.out.println("Sum must be positive");
        }
    }

    public void withdraw(double sum) {
        if(sum > balance || sum < 0){
            System.out.println("Impossible to withdraw");
        } else {
            balance -= sum;
        }
    }

    public final void print(){
        System.out.println(toString());
    }

    public void transfer(double amount, Account other) {
        if (balance >= amount && amount > 0){
            withdraw(amount);
            other.deposit(amount);
        }else {
            System.out.println("[Error] transfer failed");
        }
    }

    @Override
    public String toString() {
        return accNumber + " has: " + balance + "$";
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }
}

