package com.ankem.services;

import com.ankem.dao.CalendarDAO;
import com.ankem.dto.Calendar;
import com.ankem.dto.Event;

import com.ankem.domain.AOCalendar;
import com.ankem.repository.AoCalendarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CalendarService {
    @Autowired
    private  AoCalendarRepository aoRepository;
    
    @Autowired
    private CalendarDAO calendarDAO;
    
    public List<Calendar> getCalenders() {
        return calendarDAO.getCalendarList();
    }

    public List<Event> getEventsByCalendar(Long id, Date startDate, Date endDate) {
    	List<Event> result = new ArrayList<Event>();
    	List<AOCalendar> daoEvents = aoRepository.findByCalendarDateBetween(startDate, endDate);
    	Long i =0L;
    	for(AOCalendar cal : daoEvents){
    		result.add(new Event(i++, id, cal.getCalendarDate(),cal.getCalendarDate(), "testting"));
    	}
        //return calendarDAO.getEventsByCalendar(id, startDate, endDate);
    	return result;
    }
    
    
}
