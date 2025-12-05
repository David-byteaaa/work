import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入内容，将写入文件：");
        String input = scanner.nextLine();
        String fileName = "output.txt";
        FileWriter writer = new FileWriter(fileName);
        writer.write(input);
        writer.close();
        System.out.println("内容已写入文件：" + fileName);
        FileReader reader = new FileReader(fileName);
        System.out.println("从文件读取内容：");
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();
        scanner.close();
    }
}
