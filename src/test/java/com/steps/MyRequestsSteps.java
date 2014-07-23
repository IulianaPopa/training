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
	public void selectMyRequests() {
		vacationMenuPage.click_my_request();
	}
	
	@Step
	public void selectVacation() {
		myRequestsPage.clickHolidayCheckbox();
	}
	
	@Step
	public void applyFilter() {
		myRequestsPage.clickApplyButton();
	}
	
	@Step
	public void lookupResultsTable() {
		myRequestsPage.lookupResultsTable();
	}

	

}
