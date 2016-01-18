package ru.savochkindv.patterns.collecting_parameter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by savochkindv on 18.01.2016.
 */
public class CollectingParameterTest {

    @Test
    public void testCollectingParameter() throws Exception {
        CollectingParameter cp = new CollectingParameter();
        Filter filter = new Filter();
        filter.f(cp);
        filter.g(cp);
        filter.h(cp);
        System.out.println(cp);
        assertEquals("[accumulating, items, as we go]", cp.toString());
    }

}