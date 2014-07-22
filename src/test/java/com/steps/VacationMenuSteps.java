package com.steps;

import java.text.ParseException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.CalendarPage;
import com.pages.VacationMenuPage;
import com.pages.StartEndDateNewVacation;

@SuppressWarnings("serial")
public class VacationMenuSteps extends ScenarioSteps {
	StartEndDateNewVacation startEndDateNewVacation;

	VacationMenuPage vacationMenuPage;
	CalendarPage calendarPage;

	@Step
	public void new_request() {
		vacationMenuPage.click_new_request();
	}
	
	@Step
	public void my_request() {
		vacationMenuPage.click_my_request();
	}

	@Step
	public void my_free_days() {
		vacationMenuPage.click_my_free_days();
	}

	@Step
	public void free_days_history() {
		vacationMenuPage.click_free_days_history();
	}

}