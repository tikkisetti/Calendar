package com.ankem.repository;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ankem.domain.AOCalendar;

@Transactional
public interface AoCalendarRepository extends JpaRepository<AOCalendar, String>
{
	//String temp = " :columnName,THE_DATE from AO_CALENDAR where the_date between (:startDate, :endDate)""
	//@Query(value = "select css_holiday,THE_DATE from AO_CALENDAR where the_date between (:startDate, :endDate)")
	//List getColumnDataForADate(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
	
	List findByCalendarDateBetween(Date startDate, Date endDate);
	

}
