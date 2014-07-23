package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.RequestsAssignedToMePage;
import com.pages.VacationManagementMenuPage;

@SuppressWarnings("serial")
public class InboxSteps extends ScenarioSteps {
	VacationManagementMenuPage vacationManagementMenuPage;
	RequestsAssignedToMePage requestsAssignedToMePage;
	@Step
	public void inbox() {
		vacationManagementMenuPage.click_inbox();
	}

	
	@Step
	public void select_request() {
		requestsAssignedToMePage.click_selectRequest();
	}

	@Step
	public void approve_request() {
		requestsAssignedToMePage.click_approve_button();
	}
	
	@Step
	public void reject_request() {
		requestsAssignedToMePage.click_reject_button();
	}
}