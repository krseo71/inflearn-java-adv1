package thread.bounded;

import util.MyLogger;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BoundedQueueV6_4 implements BoundedQueue{
    private BlockingQueue<String> queue;
    public BoundedQueueV6_4(int max) {
        queue = new ArrayBlockingQueue<String>(max);

    }
    @Override
    public void put(String data) {
        queue.add(data); // java.lang.IllegalStateException: Queue full
    }

    @Override
    public String take() {
        return queue.remove(); // java.util.NosuchElementException
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
