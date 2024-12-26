package thread.start;

import util.MyLogger;

import static util.MyLogger.*;

public class InnerRunnableMainV3 {
    public static void main(String[] args) {
        log("main() start");

        // 익명 클래스 없이 직접 전달
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                log("run");

            }
        });

        thread.start();


        log("main() end");
    }
}
