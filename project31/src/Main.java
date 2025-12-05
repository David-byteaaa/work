import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        BookManager manager = new BookManager();
        Scanner scanner = new Scanner(System.in);

        // 初始化一些图书
        manager.addBook(new Book("1001", "Java入门", "张三", 5));
        manager.addBook(new Book("1002", "数据结构", "李四", 3));
        manager.addBook(new Book("1003", "算法设计", "王五", 2));

        boolean running = true;
        while (running) {
            System.out.println("\n1. 查看所有图书 2. 借书 3. 还书 4. 保存 5. 加载 6. 退出");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    manager.showBooks();
                    break;
                case 2:
                    System.out.print("输入ISBN借书：");
                    manager.borrowBook(scanner.next());
                    break;
                case 3:
                    System.out.print("输入ISBN还书：");
                    manager.returnBook(scanner.next());
                    break;
                case 4:
                    manager.saveToFile("books.dat");
                    break;
                case 5:
                    manager.loadFromFile("books.dat");
                    break;
                case 6:
                    running = false;
                    break;
            }
        }

        scanner.close();
    }
}
