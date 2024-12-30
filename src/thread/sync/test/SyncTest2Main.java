package thread.sync.test;

import util.MyLogger;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static util.MyLogger.*;

public class SyncTest2Main {
    public static void main(String[] args) {
        MyCounter myCounter = new MyCounter();
        Runnable task = myCounter::count;

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        thread1.start();
        thread2.start();
        Lock lock = new ReentrantLock();
    }

    static class MyCounter {
        public void count() {
            int localValue = 0; // 지역 변수는 다른 스레드와 공유되지 않는다.
            for (int i = 0; i < 1000; i++) {
                localValue += i;
            }
            log("결과: " + localValue);
        }
    }
}
