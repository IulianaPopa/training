package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.VacationManagementMenuPage;

@SuppressWarnings("serial")
public class VacationManagementMenuSteps extends ScenarioSteps {
	VacationManagementMenuPage vacationManagementMenuPage;

	@Step
	public void inbox() {
		vacationManagementMenuPage.click_inbox();
	}

	@Step
	public void viewVacations() {
		vacationManagementMenuPage.click_viewVacations();
	}
	
}