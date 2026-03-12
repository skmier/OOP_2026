package lab2.Task3;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(int accNum, double interestRate) {
        super(accNum);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return super.toString() + " Interest rate: " + interestRate;
    }
}
