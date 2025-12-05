public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (char c = 'A'; c <= 'J'; c++) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        };
        t1.start();
        t2.start();
    }
}
