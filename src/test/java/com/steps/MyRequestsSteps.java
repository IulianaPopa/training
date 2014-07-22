package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.CalendarPage;
import com.pages.MyRequestsPage;

import com.pages.VacationMenuPage;

@SuppressWarnings("serial")
public class MyRequestsSteps extends ScenarioSteps {

	VacationMenuPage vacationMenuPage;
	CalendarPage calendarPage;
	MyRequestsPage myRequestsPage;

	@Step
	public void my_request() {
		vacationMenuPage.click_my_request();
	}
	
	@Step
	public void select_vacation() {
		myRequestsPage.click_holidaycheckbox();
	}
	
	@Step
	public void apply_filter() {
		myRequestsPage.click_apply_button();
	}

}
