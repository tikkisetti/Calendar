package com.ankem.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "AO_CALENDAR")
public class AOCalendar implements Serializable{

	@Id
	@NotNull
	@Column(name="THE_DATE")
	private Date calendarDate;
	
	@NotNull
	@Size(max = 1)
	@Column(name="CSS_HOLIDAY")
	private String holiday;
	
	@NotNull
	@Size(max = 1)
	@Column(name="CSS_BUS_DAY")
	private String businessDay;
	
	@NotNull
	@Size(max = 1)
	@Column(name="LAST_BUS_DAY")
	private String lastBusinessDay;
	
	@NotNull
	@Size(max = 1)
	@Column(name="FRBNY_REGA")
	private String frbnyRegA;
	
	@NotNull
	@Size(max = 1)
	@Column(name="FRBNY_REGB")
	private String frbnyRegB;
	
	@NotNull
	@Size(max = 1)
	@Column(name="FRBNY_SETA")
	private String frbnySetA;
	
	
	@NotNull
	@Size(max = 1)
	@Column(name="FRBNY_SETB")
	private String frbnySetB;


	public Date getCalendarDate() {
		return calendarDate;
	}


	public void setCalendarDate(Date calendarDate) {
		this.calendarDate = calendarDate;
	}


	public String getHoliday() {
		return holiday;
	}


	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}


	public String getBusinessDay() {
		return businessDay;
	}


	public void setBusinessDay(String businessDay) {
		this.businessDay = businessDay;
	}


	public String getLastBusinessDay() {
		return lastBusinessDay;
	}


	public void setLastBusinessDay(String lastBusinessDay) {
		this.lastBusinessDay = lastBusinessDay;
	}


	public String getFrbnyRegA() {
		return frbnyRegA;
	}


	public void setFrbnyRegA(String frbnyRegA) {
		this.frbnyRegA = frbnyRegA;
	}


	public String getFrbnyRegB() {
		return frbnyRegB;
	}


	public void setFrbnyRegB(String frbnyRegB) {
		this.frbnyRegB = frbnyRegB;
	}


	public String getFrbnySetA() {
		return frbnySetA;
	}


	public void setFrbnySetA(String frbnySetA) {
		this.frbnySetA = frbnySetA;
	}


	public String getFrbnySetB() {
		return frbnySetB;
	}


	public void setFrbnySetB(String frbnySetB) {
		this.frbnySetB = frbnySetB;
	}
	
	
	
	
}
