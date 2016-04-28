package ru.savochkindv.patterns.worker_thread;

/**
 * Интерфейс, описывающий очередь
 *
 * @author savochkindv
 *         Date 28.04.2016.
 */
public interface Queue {

    /**
     * Поместить задачу в очередь
     *
     * @param r задача
     */
    void put(RunnableTask r);

    /**
     * Взять задачу
     *
     * @return задачу
     */
    RunnableTask take();
}
