package ru.savochkindv.patterns.worker_thread;

import java.util.Vector;

/**
 * Класс, реализующий очередь
 *
 * @author savochkindv
 *         Date 28.04.2016.
 */
public class ConcreteQueue implements Queue {

    /**
     * Список задач
     */
    private Vector<RunnableTask> tasks;

    /**
     * Ожидание
     */
    private boolean waiting;

    /**
     * Выключен
     */
    private boolean shutdown;

    /**
     * Конструктор
     */
    public ConcreteQueue() {
        tasks = new Vector<>();
        shutdown = false;
        new Thread(new Worker()).start();
    }

    public void setShutdown(boolean shutdown) {
        this.shutdown = shutdown;
    }

    @Override
    public void put(RunnableTask r) {
        tasks.add(r);
        if (waiting) {
            synchronized (this) {
                notifyAll();
            }
        }
    }

    @Override
    public RunnableTask take() {
        if (tasks.isEmpty()) {
            synchronized (this) {
                waiting = true;
                try {
                    wait();
                } catch (InterruptedException ie) {
                    waiting = false;
                }
            }
        }
        return tasks.remove(0);
    }

    private class Worker implements Runnable {

        @Override
        public void run() {
            while (!shutdown) {
                RunnableTask r = take();
                r.execute();
            }
        }
    }
}
