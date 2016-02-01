package ru.savochkindv.patterns.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Класс, описывающий встречу
 * Created by savochkindv on 26.01.2016.
 */
public class Appointment {

    /**
     * Список участников
     */
    private List<? super IContact> attendees = new ArrayList<>();

    /**
     * Время начала
     */
    private Date startDate;

    /**
     * Время завершения
     */
    private Date endDate;

    /**
     * Описание
     */
    private String description;

    /**
     * Место встречи
     */
    private Location location;

    public void addAttendee(IContact attendee) {
        if (!attendees.contains(attendee)) {
            attendees.add(attendee);
        }
    }

    public void removeAttendee(IContact attendee) {
        attendees.remove(attendee);
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<? super IContact> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<? super IContact> attendees) {
        if (attendees != null) {
            this.attendees = attendees;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
