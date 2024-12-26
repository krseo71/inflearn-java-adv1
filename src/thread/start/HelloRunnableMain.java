package thread.start;

public class HelloRunnableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloRunnable runnable = new HelloRunnable();
        Thread thread = new Thread(runnable);
        Thread lambdaThread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        thread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
