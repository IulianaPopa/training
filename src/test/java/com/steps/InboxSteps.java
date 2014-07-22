package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.VacationManagementMenuPage;

@SuppressWarnings("serial")
public class InboxSteps extends ScenarioSteps {
	VacationManagementMenuPage vacationManagementMenuPage;

	@Step
	public void inbox() {
		vacationManagementMenuPage.click_inbox();
	}

}