import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount(1000);
        Method method = BankAccount.class.getMethod("deposit", double.class);
        method.invoke(account, 500);
    }
}
