public class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存款成功，当前余额： " + balance);
        } else {
            System.out.println("存款金额必须大于0！");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("取款成功，当前余额： " + balance);
        } else if (amount > balance) {
            System.out.println("余额不足！");
        } else {
            System.out.println("取款金额必须大于0！");
        }
    }
    public void checkBalance() {
        System.out.println("当前账户余额为： " + balance);
    }
}
