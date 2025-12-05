import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Product product;
        int option, id;
        double price;
        String name;

        while (true) {
            System.out.println("\n====== 商品管理系统 ======");
            System.out.println("1. 添加商品");
            System.out.println("2. 查询商品");
            System.out.println("3. 退出系统");
            System.out.print("请选择操作：");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("请输入商品ID：");
                    id = scanner.nextInt();
                    System.out.print("请输入商品名称：");
                    name = scanner.next();
                    System.out.print("请输入商品价格：");
                    price = scanner.nextDouble();

                    product = new Product(id, name, price);
                    addProduct(product);
                    System.out.println("添加成功！");
                    break;

                case 2:
                    System.out.print("请输入要查询的商品ID：");
                    id = scanner.nextInt();
                    selectProduct(id);
                    break;

                case 3:
                    System.out.println("系统已退出！");
                    return;

                default:
                    System.out.println("输入错误，请重新选择！");
            }
        }
    }

    public static void addProduct(Product product) {
        products.add(product);
    }

    public static void selectProduct(int id) {
        boolean found = false;
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println("\n找到商品：");
                System.out.println("ID：" + product.getId());
                System.out.println("名称：" + product.getName());
                System.out.println("价格：" + product.getPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("未找到该商品！");
        }
    }
}
