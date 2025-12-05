import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double r = sc.nextDouble();
            double area = Math.PI * r * r;
            System.out.printf("半径为 %.2f 的圆面积是：%.2f\n", r, area);
        }
    }
}