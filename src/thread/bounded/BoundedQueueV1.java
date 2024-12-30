package thread.bounded;

import util.MyLogger;

import java.util.ArrayDeque;
import java.util.Queue;

public class BoundedQueueV1 implements BoundedQueue {

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV1(int max) {
        this.max = max;
    }

    @Override
    public synchronized void put(String data) {
        if (queue.size() == max) {
            MyLogger.log("[put] 큐가 가득 참, 버림: " + data);
            return;
        }
        queue.offer(data);

    }

    @Override
    public synchronized String take() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }

    /**
     * Producer: 데이터 생성 역할
     * Consumer: 생성된 데이터를 사용하는 역할
     * Buffer: 생산자가 생성한 데이터를 일시적으로 저장하는 공간, 한정된 크기를 가진다.
     */
}
