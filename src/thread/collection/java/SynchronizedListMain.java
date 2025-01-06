package thread.collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListMain {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("data1");
        list.add("data2");
        list.add("data3");
        System.out.println(list.getClass());
        System.out.println("list = " + list);

    }
    /**
     * 동시성 컬렉션의 종류
     * CopyOnWriteArrayList -> ArrayList
     * CopyOnWriteArraySet -> HashSet
     * ConcurrentSkipListSet -> TreeSet
     * ConcurrentHashMap -> HashMap
     * ConcurrentSkipListMap -> TreeMap
     * ConcurrentLinkedQueue
     * ConcurrentLinkedDeque
     */
}
