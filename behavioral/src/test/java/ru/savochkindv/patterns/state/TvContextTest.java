package ru.savochkindv.patterns.state;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author savochkindv
 *         Date: 15.02.2016.
 */
public class TvContextTest {

    @Test
    public void testDoAction_start() throws Exception {
        TvContext ctx = new TvContext();
        ctx.setState(new TvStartState());
        assertEquals("Телевизор включен", ctx.doAction());
    }

    @Test
    public void testDoAction_stop() throws Exception {
        TvContext ctx = new TvContext();
        ctx.setState(new TvStopState());
        assertEquals("Телевизор выключен", ctx.doAction());
    }
}