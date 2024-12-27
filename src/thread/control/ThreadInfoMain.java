package thread.control;

import thread.start.HelloRunnable;
import util.MyLogger;

import java.util.Map;

import static util.MyLogger.*;

public class ThreadInfoMain {
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId() = " + mainThread.threadId());
        log("mainThread.getName() = " + mainThread.getName());
        log("mainThread.getPriority() = " + mainThread.getPriority());
        log("mainThread.getThreadGroup() = " + mainThread.getThreadGroup());
        log("mainThread.getState() = " + mainThread.getState());

        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId() = " + myThread.threadId());
        log("myThread.getName() = " + myThread.getName());
        log("myThread.getPriority() = " + myThread.getPriority());
        log("myThread.getThreadGroup() = " + myThread.getThreadGroup());

        /**
         * getState()
         *
         * NEW: 스레드가 아직 시작되지 않은 상태
         * RUNNABLE: 스레드가 실행중이거나 실행될 준비가 된 상태
         * BLOCKED: 스레드가 동기화 락을 기다리는 상태
         * WAITING: 스레드가 다른 스레드의 특정 작업이 완료되기를 기다리는 상태
         * TIMED_WAITING: 일정 시간 동안 기다리는 상태
         * TERMINATED: 스레드가 실행을 마친 상태
         */

    }
}
