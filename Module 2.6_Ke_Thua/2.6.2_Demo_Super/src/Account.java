public class Account {
    private double balance = 0;
    public double depoint(double money){
       return balance += money;
    }
    public double withdraw(double money){
        return balance -=money;
    }

    public double getBalance() {
        return balance;
    }
}
class FeeBasedAccount extends Account{
    double fee = 10;
    Account account = new Account();
    public double withdraw(double money){
        balance = account.getBalance();
        super.withdraw(money);
        return balance -=fee;
    }

}