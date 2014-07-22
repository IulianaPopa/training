package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.CalendarPage;

import com.pages.VacationMenuPage;

@SuppressWarnings("serial")
public class FreeDaysHistorySteps extends ScenarioSteps {

	VacationMenuPage vacationMenuPage;
	CalendarPage calendarPage;

	@Step
	public void free_days_history() {
		vacationMenuPage.click_free_days_history();
	}

}