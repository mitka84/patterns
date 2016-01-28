package ru.savochkindv.patterns.singleton;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by savochkindv on 28.01.2016.
 */
public abstract class AbstractSingletonWorker<T extends ISingleton> implements Runnable {

    private CountDownLatch timer;
    private List<T> list;
    private AtomicInteger countFinished;

    public AbstractSingletonWorker(CountDownLatch timer, AtomicInteger countFinished, List<T> list) {
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
        list.add(getInstance());
        countFinished.incrementAndGet();
        System.out.println("Finish work");
    }

    protected abstract T getInstance();

}
