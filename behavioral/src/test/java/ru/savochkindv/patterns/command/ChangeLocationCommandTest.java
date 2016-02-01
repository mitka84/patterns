package ru.savochkindv.patterns.command;

import org.junit.Before;
import org.junit.Test;
import ru.savochkindv.patterns.model.Appointment;
import ru.savochkindv.patterns.model.Location;

import static org.junit.Assert.*;

/**
 * Created by savochkindv on 01.02.2016.
 */
public class ChangeLocationCommandTest {

    private ChangeLocationCommand command;

    @Before
    public void setUp() throws Exception {
        command = new ChangeLocationCommand();
        command.setAppointment(new Appointment());
        command.setEditor(new LocationEditorImpl());
    }

    @Test
    public void testExecute() throws Exception {
        assertNull(command.getAppointment().getLocation());
        command.execute();
        assertNotNull(command.getAppointment().getLocation());
        System.out.println("Location after execute: " + command.getAppointment().getLocation().getLocation());
    }

    @Test
    public void testUndo() throws Exception {
        assertNull(command.getAppointment().getLocation());
        command.execute();
        Location currentLocation = command.getAppointment().getLocation();
        assertNotNull(currentLocation);
        System.out.println("Location after first execute: " + currentLocation.getLocation());

        command.execute();
        Location newLocation = command.getAppointment().getLocation();
        assertNotNull(newLocation);
        System.out.println("Location after second execute: " + newLocation.getLocation());

        command.undo();
        Location undoLocation = command.getAppointment().getLocation();
        assertNotNull(undoLocation);
        System.out.println("Location after undo: " + undoLocation.getLocation());
        assertEquals(currentLocation, undoLocation);
    }

    @Test
    public void testRedo() throws Exception {
        assertNull(command.getAppointment().getLocation());
        command.execute();
        Location currentLocation = command.getAppointment().getLocation();
        assertNotNull(currentLocation);
        System.out.println("Location after first execute: " + currentLocation.getLocation());

        command.execute();
        Location newLocation = command.getAppointment().getLocation();
        assertNotNull(newLocation);
        System.out.println("Location after second execute: " + newLocation.getLocation());

        command.undo();
        Location undoLocation = command.getAppointment().getLocation();
        assertNotNull(undoLocation);
        System.out.println("Location after undo: " + undoLocation.getLocation());
        assertEquals(currentLocation, undoLocation);

        command.redo();
        Location redoLocation = command.getAppointment().getLocation();
        assertNotNull(redoLocation);
        System.out.println("Location after redo: " + redoLocation.getLocation());
        assertEquals(newLocation, redoLocation);

    }
}