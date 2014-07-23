package com.steps;

import java.util.List;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.VacationManagementMenuPage;

@SuppressWarnings("serial")
public class ViewVacationsSteps extends ScenarioSteps {
	VacationManagementMenuPage vacationManagementMenuPage;
	ViewVacationsSteps viewVacationsSteps;
	@Step
	public void viewVacations() {
		vacationManagementMenuPage.click_viewVacations();
	}
	
	@Step
	 public void check_type_request_in_range(String value) {
	  List<String> daysList = vacationManagementMenuPage.get_type_request_list();

	  for (String val : daysList) {
	   Assert.assertTrue("Type Requests Holiday not in selected range!!!",value!=val);
	  }
}
}