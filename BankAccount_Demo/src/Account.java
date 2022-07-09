public class Account {
    private int account_number;
    private double balance;

    public Account(){
    }
    public Account(int account_number, double balance) {
        this.account_number = account_number;
        this.balance = balance;
    }

    public int getAccount_number(){
        return account_number;
    }
    public void setAccount_number(int account_number){
        this.account_number = account_number;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void deposit(double depositAmount){
        balance += depositAmount;
        System.out.println("You have deposited $" + depositAmount
                + ". Your balance is now S" + balance);
    }
    public void withdraw(double withdrawAmount){
        if(this.balance - withdrawAmount < 0){
            System.out.println("Insufficient funds, cannot withdraw!");
        }else {
            balance -= withdrawAmount;
            System.out.println("You have withdrawn $" + withdrawAmount + " Your remaining balance is now S" + balance);
        }
    }
}
