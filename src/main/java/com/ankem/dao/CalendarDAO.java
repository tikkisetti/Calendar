package com.ankem.dao;

import static java.util.Calendar.DAY_OF_MONTH;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ankem.dto.Calendar;
import com.ankem.dto.Event;
import com.ankem.dto.EventStore;
import com.ankem.dto.Proxy;

@Repository
public class CalendarDAO {
    String[] listOfCalendars = {"calendar1", "calendar2", "calendar3"};


    public List<Calendar> getCalendarList() {
        List<Calendar> calendars = new ArrayList<>();

        for (Long i = 0L; i < 3; i++) {
        	Calendar calc = new Calendar(i, listOfCalendars[i.intValue()]);
        	Proxy proxy = new Proxy("ajax","/calenders/"+i+"/events");
        	calc.setEventStore(new EventStore(proxy));
            calendars.add(calc);
        }
        return calendars;
    }

    public List<Event> getEventsByCalendar(Long id, Date startDate, Date endDate) {
        List<Event> events = new ArrayList<>();
//        GregorianCalendar startDayCal = new GregorianCalendar(startDate.getYear(), startDate.getMonth(), startDate.getDay());
//        GregorianCalendar endDayCal = new GregorianCalendar(endDate.getYear(), endDate.getMonth(), endDate.getDay());
        //for (Long i = 0l; startDate.before(endDate); i++) {
            events.add(new Event(1L, id, startDate, startDate, "testing"));
            //startDate.add(DAY_OF_MONTH, 1);
          // startDate = new Date(startDate.getYear(), startDate.getMonth(), startDate.getDay()+1);
        //}
        return events;
    }
}
