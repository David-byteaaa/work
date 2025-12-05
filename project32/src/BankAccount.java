import java.io.Serializable;

class BankAccount implements Serializable {
    private String accountId;
    private String username;
    private double balance;

    public BankAccount(String accountId, String username, double balance) {
        this.accountId = accountId;
        this.username = username;
        this.balance = balance;
    }

    public String getAccountId() { return accountId; }
    public String getUsername() { return username; }

    public synchronized double getBalance() {
        return balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(username + " 存款 " + amount + " 成功，余额：" + balance);
    }

    public synchronized void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(username + " 取款 " + amount + " 成功，余额：" + balance);
        } else {
            System.out.println(username + " 取款失败，余额不足！");
        }
    }

    public void display() {
        System.out.println("账户ID：" + accountId + " 用户名：" + username + " 余额：" + balance);
    }
}
