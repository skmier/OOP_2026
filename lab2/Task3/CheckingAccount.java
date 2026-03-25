package lab2.Task3;

public class CheckingAccount extends Account {
    private int counter;
    private int FREE_TRANSACTIONS = 5;

    public CheckingAccount(int accNum) {
        super(accNum);
    }

    public void deductFee(){
        if (counter > FREE_TRANSACTIONS){
            if (getBalance() > 0.02){
                balance -= 0.02;
            }
            else {
                System.out.println("You still have free transactions");
            }
        }
    }

    @Override
    public void withdraw(double sum) {
        if (counter + 1 > FREE_TRANSACTIONS && getBalance() < 0.02 + sum){
            System.out.println("[ERROR] not enough money");
        }else {
            super.withdraw(sum);
            counter++;
            deductFee();
        }
    }

    @Override
    public void deposit(double sum) {
        if (counter + 1 > FREE_TRANSACTIONS && sum + getBalance() < 0.02){
            System.out.println("[ERROR] Not enough money");
        }
        else {
            super.deposit(sum);
            counter++;
            deductFee();
        }

    }
}
