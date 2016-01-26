package ru.savochkindv.patterns.builder;

import java.util.Date;
import java.util.List;

/**
 * Класс, описывающий диспетчера построителя
 * Created by savochkindv on 26.01.2016.
 */
public class Scheduler {

    /**
     * Создает встречу
     *
     * @param builder     построитель
     * @param startDate   дата начала
     * @param endDate     дата конца
     * @param description описание
     * @param location    расположение
     * @param attendees   список участников
     * @return встречу
     * @throws InformationRequiredException
     */
    public Appointment createAppointment(AppointmentBuilder builder, Date startDate, Date endDate, String description,
                                         Location location, List<Contact> attendees) throws InformationRequiredException {
        if (builder == null) {
            builder = new AppointmentBuilder();
        }
        builder.buildAppointment();
        builder.appendDates(startDate, endDate);
        builder.appendDescription(description);
        builder.appendAttendees(attendees);
        builder.appendLocation(location);
        return builder.getAppointment();
    }
}
