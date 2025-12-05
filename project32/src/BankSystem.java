import java.io.*;
import java.util.HashMap;

class BankSystem {
    private HashMap<String, BankAccount> accounts = new HashMap<>();

    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountId(), account);
    }

    public BankAccount getAccount(String accountId) {
        return accounts.get(accountId);
    }

    public void saveToFile(String fileName) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(accounts);
        oos.close();
        System.out.println("账户信息已保存到文件：" + fileName);
    }

    public void loadFromFile(String fileName) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        accounts = (HashMap<String, BankAccount>) ois.readObject();
        ois.close();
        System.out.println("账户信息已从文件加载：" + fileName);
    }

    public void showAllAccounts() {
        for (BankAccount acc : accounts.values()) {
            acc.display();
        }
    }
}
