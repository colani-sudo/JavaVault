public class Silver_Acc extends Account{
    private double wCharge = 10;
    public Silver_Acc(int account_number, double balance, double wCharge) {
        super(account_number, balance);
    }

    public double getwCharge() {
        return wCharge;
    }

    public void deposit(double depositAmount){
        double balance = getBalance() + depositAmount;
        setBalance(balance-getwCharge());
        System.out.println("You have deposited $" + depositAmount
                + ". Your balance is now S" + balance);
    }
    public void withdraw(double withdrawalAmount){
        double balance;

        if(getBalance() - withdrawalAmount < 0){
            System.out.println("Insufficient funds, cannot withdraw!");
        }else {
            balance = getBalance() - withdrawalAmount;
            setBalance(balance-getwCharge());
            System.out.println("You have withdrawn $" + withdrawalAmount + " Your remaining balance is now S" + balance);
        }
    }

}
