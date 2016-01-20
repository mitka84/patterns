package ru.savochkindv.patterns.singleton;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Класс, описывающий воркера для теста
 * Created by savochkindv on 19.01.2016.
 */
public class SingletonWorker1 implements Runnable {

    private CountDownLatch timer;
    private List<FirstSingleton> list;
    private AtomicInteger countFinished;

    public SingletonWorker1(CountDownLatch timer, AtomicInteger countFinished, List<FirstSingleton> list) {
        this.timer = timer;
        this.list = list;
        this.countFinished = countFinished;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            timer.await();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        list.add(FirstSingleton.getInstance());
        countFinished.incrementAndGet();
        System.out.println("Finish work");
    }
}
