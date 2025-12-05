import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        Scanner input = new Scanner(System.in);
        double amount = 0;
        amount = input.nextDouble();
        account.deposit(amount);
        amount = input.nextDouble();
        account.withdraw(amount);
        account.checkBalance();
    }
}