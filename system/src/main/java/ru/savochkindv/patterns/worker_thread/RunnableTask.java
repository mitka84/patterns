package ru.savochkindv.patterns.worker_thread;

/**
 * Класс, описывающий задачу
 *
 * @author savochkindv
 *         Date 28.04.2016.
 */
public interface RunnableTask {

    /**
     * Выполнить задачу
     */
    void execute();
}
