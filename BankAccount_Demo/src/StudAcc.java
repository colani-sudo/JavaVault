public class StudAcc extends Account {
    public double wCharge = 5;

    public StudAcc(int acc_num, double balance) {
        super(acc_num, balance);
    }

    public double getwCharge() {
        return wCharge;
    }


    @Override
    public void deposit(double depositAmount) {
        System.out.println("Deposits");
        super.deposit(depositAmount);
    }

    @Override
    public void withdraw(double withdrawAmount) {
        System.out.println("Withdrawals");
        super.withdraw(withdrawAmount);
    }
}
