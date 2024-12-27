package thread.control.join;

import util.MyLogger;
import util.ThreadUtils;

import static util.MyLogger.*;
import static util.ThreadUtils.*;

public class JoinMainV0 {
    public static void main(String[] args) {
        log("Start");
        Thread thread1 = new Thread(new Job(), "thread-1");
        Thread thread2 = new Thread(new Job(), "thread-2");

        thread1.start();
        thread2.start();
        log("End");
    }

    /**
     *
     13:46:25.571 [     main] Start
     13:46:25.590 [     main] End
     13:46:25.591 [ thread-2] 작업 시작
     13:46:25.591 [ thread-1] 작업 시작
     13:46:27.620 [ thread-1] 작업 완료
     13:46:27.620 [ thread-2] 작업 완료
     */

    static class Job implements Runnable {
        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);
            log("작업 완료");

        }
    }
}
