package ru.savochkindv.patterns.singleton;

import org.junit.Test;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by savochkindv on 19.01.2016.
 */
public class FirstSingletonTest {

    private static final int THREADS = 50;

    @Test
    public void testGetInstance() throws Exception {
        CountDownLatch counter = new CountDownLatch(1);
        List<FirstSingleton> list = new CopyOnWriteArrayList<>();
        AtomicInteger countFinished = new AtomicInteger(0);
        for (int i = 0; i < THREADS; ++i) {
            new SingletonWorker1(counter, countFinished, list);
        }
        counter.countDown();
        while (countFinished.get() != THREADS) { //Как подругому заджойнить основной поток и другие из CountDownLatch?
            Thread.sleep(10);
        }
        System.out.println("All finished");
        System.out.println(list.size());
        FirstSingleton first = list.get(0);
        for (FirstSingleton singleton : list) {
            if (!first.equals(singleton)) {
                System.out.println("Awesome! Different singletons!");
                break;
            }
        }
    }
}