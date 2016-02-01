package ru.savochkindv.patterns.command;

import ru.savochkindv.patterns.model.Appointment;
import ru.savochkindv.patterns.model.Location;

/**
 * Класс, описывающий реализацию команды смены местоположения
 * Created by savochkindv on 01.02.2016.
 */
public class ChangeLocationCommand implements IUndoableCommand {

    /**
     * Событие
     */
    private Appointment appointment;

    /**
     * Старое местоположение
     */
    private Location oldLocation;

    /**
     * Новое местоположение
     */
    private Location newLocation;

    /**
     * Редактор местоположения
     */
    private ILocationEditor editor;

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public void setEditor(ILocationEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        oldLocation = appointment.getLocation();
        newLocation = editor.getNewLocation();
        appointment.setLocation(newLocation);
    }

    @Override
    public void undo() {
        appointment.setLocation(oldLocation);
    }

    @Override
    public void redo() {
        appointment.setLocation(newLocation);
    }

}
