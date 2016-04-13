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
    public void getCurrencySymbol() throws Exception {

    }

    @Test
    public void getNumberFormat() throws Exception {

    }

    @Test
    public void getPhonePrefix() throws Exception {

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