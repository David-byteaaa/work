import java.io.FileInputStream;
import java.util.Properties;
public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "config.properties";
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(fileName);
        prop.load(fis);
        fis.close();
        for (String key : prop.stringPropertyNames()) {
            String value = prop.getProperty(key);
            System.out.println(key + " = " + value);
        }
    }
}
