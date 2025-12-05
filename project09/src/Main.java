import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        try {
            n = scanner.nextInt();
            if(n < 0){
                throw new NegativeNumberException("错误：不能输入负数！");
            }
        }catch (NegativeNumberException e){
            System.out.println(e.getMessage());
        }
    }
}