import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("请输入数字的个数：");
        int n = scanner.nextInt();
        System.out.println("请输入 " + n + " 个数字：");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println("原始列表：" + list);
        HashSet<Integer> set = new HashSet<>(list);
        ArrayList<Integer> uniqueList = new ArrayList<>(set);
        System.out.println("去重后的列表：" + uniqueList);
        scanner.close();
    }
}
