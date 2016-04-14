package ru.savochkindv.patterns.facade;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author savochkindv
 *         Date: 13.04.2016.
 */
public class InternationalizationWizardTest {

    private InternationalizationWizard wizard = new InternationalizationWizard();

    @Test
    public void getCurrencySymbol_USA() throws Exception {
        wizard.setNation(NationType.USA);
        assertEquals('$', wizard.getCurrencySymbol());
    }

    @Test
    public void getCurrencySymbol_GER() throws Exception {
        wizard.setNation(NationType.GER);
        assertEquals('f', wizard.getCurrencySymbol());
    }

    @Test
    public void getCurrencySymbol_FRA() throws Exception {
        wizard.setNation(NationType.FRA);
        assertEquals('f', wizard.getCurrencySymbol());
    }


    @Test
    public void getNumberFormat_USA() throws Exception {
        wizard.setNation(NationType.USA);
        assertEquals("100,000,000", wizard.getNumberFormat().format(100000000));
    }

    @Test
    public void getNumberFormat_GER() throws Exception {
        wizard.setNation(NationType.GER);
        assertEquals("100.000.000", wizard.getNumberFormat().format(100000000));
    }

    @Test
    public void getNumberFormat_FRA() throws Exception {
        wizard.setNation(NationType.FRA);
        assertEquals("100 000 000", wizard.getNumberFormat().format(100000000));
    }

    @Test
    public void getPhonePrefix_USA() throws Exception {
        wizard.setNation(NationType.USA);
        assertEquals("+1", wizard.getPhonePrefix());
    }


    @Test
    public void getPhonePrefix_GER() throws Exception {
        wizard.setNation(NationType.GER);
        assertEquals("+31", wizard.getPhonePrefix());
    }

    @Test
    public void getPhonePrefix_FRA() throws Exception {
        wizard.setNation(NationType.FRA);
        assertEquals("+33", wizard.getPhonePrefix());
    }

    @Test
    public void getProperty_US() throws Exception {
        wizard.setNation(NationType.USA);
        assertEquals("Hello!", wizard.getPropery("hello"));
        assertEquals("Good bye!", wizard.getPropery("bye"));
    }

    @Test
    public void getProperty_GER() throws Exception {
        wizard.setNation(NationType.GER);
        assertEquals("Germany, Hello!", wizard.getPropery("hello"));
        assertEquals("Good bye, Germany!", wizard.getPropery("bye"));
    }

    @Test
    public void getProperty_FRA() throws Exception {
        wizard.setNation(NationType.FRA);
        assertEquals("Hello, France!", wizard.getPropery("hello"));
        assertEquals("Good bye, France!", wizard.getPropery("bye"));
    }

}