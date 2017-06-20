package com.ankem.controllers;

import com.ankem.dto.Calendar;
import com.ankem.dto.Event;
import com.ankem.services.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class CalendarController {
    @Autowired
    private CalendarService service;

    @RequestMapping(value = "/calenders", method = GET)
    public List<Calendar> getCalendarList() {
        return service.getCalenders();
    }

    @RequestMapping(value = "/calenders/{id}/events", method = GET)
    public List<Event> getEvents(@PathVariable Long id,
//                                 @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                                 @RequestParam String startDate,
//                                 @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                                 @RequestParam String endDate) throws ParseException {
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
    	Date startDt = formatter.parse(startDate);
    	Date endDt = formatter.parse(endDate);
    	
    	System.out.println(startDt.toString());
    	
        return service.getEventsByCalendar(id, startDt, endDt);
    }
}
