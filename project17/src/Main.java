class Data {
    private int value;
    private boolean hasValue = false;
    public synchronized void produce(int val) {
        while (hasValue) {
            try { wait(); } catch (InterruptedException e) {}
        }
        value = val;
        System.out.println("生产者生产：" + val);
        hasValue = true;
        notify();
    }
    public synchronized int consume() {
        while (!hasValue) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("消费者消费：" + value);
        hasValue = false;
        notify();
        return value;
    }
}
public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Thread producer = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    data.produce(i);
                }
            }
        };
        Thread consumer = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    data.consume();
                }
            }
        };
        producer.start();
        consumer.start();
    }
}
