package com.samodeika.spring.XMLConfiguration.factories;

import com.samodeika.spring.XMLConfiguration.beans.CalendarBean;

import java.util.Calendar;

/**
 * Created by Alexander Nikolov on 3.10.2017 г..
 */
public class CustomFactory {

    private CustomFactory() {
        System.out.println("Instantiating custom factory");
    }

    public CalendarBean getCalendarInstance() {
        System.out.println("Creating CalendarBean");
        return new CalendarBean(Calendar.getInstance());
    }

}
