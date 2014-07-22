package com.steps;

import java.text.ParseException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.CalendarPage;
import com.pages.VacationMenuPage;

@SuppressWarnings("serial")
public class NewVacationRequestSteps extends ScenarioSteps {

	VacationMenuPage vacationMenuPage;
	CalendarPage calendarPage;

    @Step
    public void new_request() {
    	vacationMenuPage.click_new_request();
    }
    
   
    
    @Step
    public void select_start_date() {
    	vacationMenuPage.click_startDate();
    }
    @Step
    public void select_end_date() {
    	vacationMenuPage.click_endDate();
    }
   
    public void select_start_date(int month, int day, int year) throws ParseException {

    	calendarPage.setDate(month, day, year);
    }
    
    @Step
    public void select_date(int month, int day, int year) throws ParseException {
    	calendarPage.setDate(month, day, year);
    }
    
}