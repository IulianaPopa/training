package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.RequestsAssignedToMePage;
import com.pages.VacationManagementMenuPage;

@SuppressWarnings("serial")
public class RequestAssignedToMeSteps extends ScenarioSteps {
	VacationManagementMenuPage vacationManagementMenuPage;
	RequestsAssignedToMePage requestsAssignedToMePage;

	@Step
	public void inbox() {
		requestsAssignedToMePage.click_inbox();
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

	@Step
	public void display_request() {
		requestsAssignedToMePage.click_displayRequest();
	}

	@Step
	public void approve_display_request() {
		requestsAssignedToMePage.click_approve_displayRequest();
	}

	@Step
	public void reject_display_request() {
		requestsAssignedToMePage.click_reject_displayRequest();
	}
	@Step
	public void select_items_per_page(String value) {
		requestsAssignedToMePage.select_drop_down_list(value);
	}
	
	
}