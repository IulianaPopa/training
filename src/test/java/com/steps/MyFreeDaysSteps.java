package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.CalendarPage;

import com.pages.VacationMenuPage;


@SuppressWarnings("serial")
public class MyFreeDaysSteps extends ScenarioSteps {

	VacationMenuPage vacationMenuPage;
	CalendarPage calendarPage;

	  @Step
	    public void my_free_days() {
		  vacationMenuPage.click_my_free_days();
	    }
   
  
    
}