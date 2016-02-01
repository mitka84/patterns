package ru.savochkindv.patterns.builder;

import org.junit.Before;
import org.junit.Test;
import ru.savochkindv.patterns.model.Appointment;
import ru.savochkindv.patterns.model.ContactImpl;
import ru.savochkindv.patterns.model.IContact;
import ru.savochkindv.patterns.model.Location;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by savochkindv on 26.01.2016.
 */
public class SchedulerTest {

    private Scheduler scheduler;

    @Before
    public void setUp() throws Exception {
        scheduler = new Scheduler();
    }

    @Test
    public void testCreateAppointment_ok() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 5);
        Appointment appointment = null;
        try {
            appointment = scheduler.createAppointment(new AppointmentBuilder(), calendar.getTime(), null, "Встреча", new Location("Москва"), Arrays.asList(newContact("Дмитрий", "Савочкин", "Савок", "БИФИТ")));
        } catch (InformationRequiredException ire) {
            fail();
        }
        assertNotNull(appointment);
        assertEquals(calendar.getTime(), appointment.getStartDate());
        assertNull(appointment.getEndDate());
        assertEquals("Встреча", appointment.getDescription());
        assertNotNull(appointment.getLocation());
        assertEquals("Москва", appointment.getLocation().getLocation());
        assertNotNull(appointment.getAttendees());
        assertEquals(1, appointment.getAttendees().size());
    }

    @Test
    public void testCreateAppointment_fail() throws Exception {
        Appointment appointment = null;
        try {
            scheduler.createAppointment(new AppointmentBuilder(), null, null, null, null, null);
            fail();
        } catch (InformationRequiredException ire) {
            assertEquals(25, ire.getInformationRequired());
        }
    }

    @Test
    public void testCreateMeeting_ok() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 5);
        Date startDate = calendar.getTime();
        calendar.add(Calendar.DATE, 5);
        Date endDate = calendar.getTime();
        Appointment appointment = null;
        try {
            appointment = scheduler.createAppointment(new MeetingBuilder(), startDate, endDate, "Встреча", new Location("Москва"), Arrays.asList(newContact("Дмитрий", "Савочкин", "Савок", "БИФИТ")));
        } catch (InformationRequiredException ire) {
            fail();
        }
        assertNotNull(appointment);
        assertEquals(startDate, appointment.getStartDate());
        assertEquals(endDate, appointment.getEndDate());
        assertEquals("Встреча", appointment.getDescription());
        assertNotNull(appointment.getLocation());
        assertEquals("Москва", appointment.getLocation().getLocation());
        assertNotNull(appointment.getAttendees());
        assertEquals(1, appointment.getAttendees().size());
    }

    @Test
    public void testCreateMeeting_fail() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 5);
        Appointment appointment = null;
        try {
            appointment = scheduler.createAppointment(new MeetingBuilder(), calendar.getTime(), null, "Встреча", new Location("Москва"), Arrays.asList(newContact("Дмитрий", "Савочкин", "Савок", "БИФИТ")));
            fail();
        } catch (InformationRequiredException ire) {
            assertEquals(2, ire.getInformationRequired());
        }
    }

    private IContact newContact(String firstName, String lastName, String title, String organization) {
        return new ContactImpl(firstName, lastName, title, organization);
    }

}