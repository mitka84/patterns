package ru.savochkindv.patterns.builder;

import java.util.Date;
import java.util.List;

/**
 * Построитель встречи
 * Created by savochkindv on 26.01.2016.
 */
public class AppointmentBuilder {

    /**
     * Встреча
     */
    protected Appointment appointment;

    /**
     * Требуемые элементы
     */
    protected int requiredElements;

    /**
     * Строит встречу
     */
    public void buildAppointment() {
        appointment = new Appointment();
    }

    /**
     * Добавляет даты начала и конца у встречи
     *
     * @param startDate дата начала
     * @param endDate   дата конца
     */
    public void appendDates(Date startDate, Date endDate) {
        Date currentDate = new Date();
        if (startDate != null && startDate.after(currentDate)) {
            appointment.setStartDate(startDate);
        }
        if (endDate != null && endDate.after(startDate)) {
            appointment.setEndDate(endDate);
        }
    }

    /**
     * Добавляет описание встречи
     *
     * @param description описание
     */
    public void appendDescription(String description) {
        appointment.setDescription(description);
    }

    /**
     * Добавляет список участников
     *
     * @param attendees список участников
     */
    public void appendAttendees(List<Contact> attendees) {
        if (attendees != null && !attendees.isEmpty()) {
            appointment.setAttendees(attendees);
        }
    }

    /**
     * Добавляет местоположение встречи
     *
     * @param location
     */
    public void appendLocation(Location location) {
        if (location != null) {
            appointment.setLocation(location);
        }
    }

    /**
     * Возвращает построенный объект встречи
     *
     * @return объект встречи
     * @throws InformationRequiredException если не все элементы указаны
     */
    public Appointment getAppointment() throws InformationRequiredException {
        if (appointment.getStartDate() == null) {
            requiredElements += InformationRequiredException.START_DATE_REQUIRED;
        }
        if (appointment.getLocation() == null) {
            requiredElements += InformationRequiredException.LOCATION_REQUIRED;
        }
        if (appointment.getAttendees().isEmpty()) {
            requiredElements += InformationRequiredException.ATTENDEE_REQUIRED;
        }
        if (requiredElements > 0) {
            throw new InformationRequiredException(requiredElements);
        }
        return appointment;
    }

    public int getRequiredElements() {
        return requiredElements;
    }
}
