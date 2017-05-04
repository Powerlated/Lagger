/**
 * Created by Brian on 5/3/2017.
 */
public class Lagger {
    static int threads = Runtime.getRuntime().availableProcessors();
    public static void main(String[] args) {
        System.out.println(threads + " threads detected");
        System.out.println("Starting lagger in 10 seconds...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int counter = 0;
        while (counter != threads) {
            new Thread(() -> {
                System.out.println("Starting lagger for thread " + Thread.currentThread().getName() + " in 5 seconds.");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (true) {
                }
            }).start();
            counter++;
        }
    }
}
