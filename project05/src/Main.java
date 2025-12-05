import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("请输入年份：");
            int year = scanner.nextInt();
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " 是闰年");
            } else {
                System.out.println(year + " 不是闰年");
            }
        }
    }
}
