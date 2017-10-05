package com.samodeika.spring.XMLConfiguration.beans;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Alexander Nikolov on 3.10.2017 г..
 */
public class CalendarBean {

    private Calendar calendar;

    public CalendarBean(Calendar calendar) {
        this.calendar = calendar;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public Date getTime() {
        return calendar.getTime();
    }

    @Override
    public String toString() {
        return "CalendarBean{" +
                "calendar=" + calendar +
                '}';
    }
}
