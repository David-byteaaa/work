import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "test.txt";
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        int count = 0;
        while (scanner.hasNext()) {
            scanner.next();
            count++;
        }
        System.out.println("文件 \"" + fileName + "\" 中的单词数量为：" + count);
        scanner.close();
    }
}
