import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Main {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            int taskNum = i;
            pool.submit(() -> {
                System.out.println("任务 " + taskNum + " 正在执行，线程：" + Thread.currentThread().getName());
            });
        }
        pool.shutdown();
    }
}
