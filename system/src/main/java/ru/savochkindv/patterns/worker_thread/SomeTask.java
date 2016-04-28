package ru.savochkindv.patterns.worker_thread;

/**
 * Класс, описывающий некую задачу
 *
 * @author savochkindv
 *         Date 28.04.2016.
 */
public class SomeTask implements RunnableTask {

    private int number;

    public SomeTask(int number) {
        this.number = number;
    }

    @Override
    public void execute() {
        System.out.println("Task number " + number + " finished!");
    }
}
