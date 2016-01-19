package ru.savochkindv.patterns.singleton.second;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Класс, описывающий воркера для теста
 * Created by savochkindv on 19.01.2016.
 */
public class SingletonWorker implements Runnable {

    private CountDownLatch timer;
    private List<SecondSingleton> list;
    private AtomicInteger countFinished;

    public SingletonWorker(CountDownLatch timer, AtomicInteger countFinished, List<SecondSingleton> list) {
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
        list.add(SecondSingleton.getInstance());
        countFinished.incrementAndGet();
        System.out.println("Finish work");
    }
}
