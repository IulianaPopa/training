package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.CalendarPage;

import com.pages.VacationMenuPage;


@SuppressWarnings("serial")
public class MyRequestsSteps extends ScenarioSteps {

	VacationMenuPage vacationMenuPage;
	CalendarPage calendarPage;

	  @Step
	    public void my_request() {
		  vacationMenuPage.click_my_request();
	    }
   
  
    
}