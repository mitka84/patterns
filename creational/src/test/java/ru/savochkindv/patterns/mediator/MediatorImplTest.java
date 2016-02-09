package ru.savochkindv.patterns.mediator;

import org.junit.Test;

/**
 * Created by savochkindv on 09.02.2016.
 */
public class MediatorImplTest {

    @Test
    public void testSend() throws Exception {
        MediatorImpl m = new MediatorImpl();

        Colleague1Impl c1 = new Colleague1Impl(m);
        Colleague2Impl c2 = new Colleague2Impl(m);

        m.setColleague1(c1);
        m.setColleague2(c2);

        c1.send("How are you?");
        c2.send("Fine, thanks");
    }
}