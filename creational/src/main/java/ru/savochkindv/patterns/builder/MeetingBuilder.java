package ru.savochkindv.patterns.builder;

/**
 * Класс, описывающий деловую встречу (необходима дата завершения)
 * Created by savochkindv on 26.01.2016.
 */
public class MeetingBuilder extends AppointmentBuilder {

    @Override
    public Appointment getAppointment() throws InformationRequiredException {

        try {
            super.getAppointment();
        } finally {
            if (appointment.getEndDate() == null) {
                requiredElements += InformationRequiredException.END_DATE_REQUIRED;
            }
        }
        if (requiredElements > 0) {
            throw new InformationRequiredException(requiredElements);
        }
        return appointment;
    }
}
