package ru.savochkindv.patterns.worker_thread;

import org.junit.Test;

/**
 * Класс, описывающий
 *
 * @author savochkindv
 *         Date 28.04.2016.
 */
public class ConcreteQueueTest {

    @Test
    public void testPut() throws Exception {
        ConcreteQueue queue = new ConcreteQueue();
        for (int i = 1; i <= 10; i++) {
            queue.put(new SomeTask(i));
        }
    }

}