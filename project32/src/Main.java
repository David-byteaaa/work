import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        BankSystem bank = new BankSystem();

        // 初始化几个账户
        bank.addAccount(new BankAccount("001", "Alice", 1000));
        bank.addAccount(new BankAccount("002", "Bob", 2000));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. 查看所有账户 2. 存款 3. 取款 4. 保存 5. 加载 6. 多线程演示 7. 退出");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    bank.showAllAccounts();
                    break;
                case 2:
                    System.out.print("输入账户ID：");
                    String depositId = scanner.next();
                    System.out.print("输入存款金额：");
                    double depAmount = scanner.nextDouble();
                    BankAccount depAcc = bank.getAccount(depositId);
                    if (depAcc != null) depAcc.deposit(depAmount);
                    else System.out.println("账户不存在！");
                    break;
                case 3:
                    System.out.print("输入账户ID：");
                    String withdrawId = scanner.next();
                    System.out.print("输入取款金额：");
                    double witAmount = scanner.nextDouble();
                    BankAccount witAcc = bank.getAccount(withdrawId);
                    if (witAcc != null) witAcc.withdraw(witAmount);
                    else System.out.println("账户不存在！");
                    break;
                case 4:
                    bank.saveToFile("accounts.dat");
                    break;
                case 5:
                    bank.loadFromFile("accounts.dat");
                    break;
                case 6:
                    // 多线程演示
                    BankAccount acc = bank.getAccount("001");
                    Thread t1 = new Thread(() -> acc.deposit(500));
                    Thread t2 = new Thread(() -> acc.withdraw(800));
                    Thread t3 = new Thread(() -> acc.deposit(200));
                    t1.start();
                    t2.start();
                    t3.start();
                    t1.join();
                    t2.join();
                    t3.join();
                    break;
                case 7:
                    running = false;
                    break;
            }
        }

        scanner.close();
    }
}
