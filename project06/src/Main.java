import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        char ch;
        while (true) {
            a = scanner.nextDouble();
            ch = scanner.next().charAt(0);
            b = scanner.nextDouble();
            switch (ch) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    if (b == 0) System.out.println("Wrong");
                    else System.out.println(a / b);
                    break;
            }
        }
    }
}