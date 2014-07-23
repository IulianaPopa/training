package com.steps;

import java.text.ParseException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.CalendarPage;
import com.pages.VacationMenuPage;
import com.pages.StartEndDateNewVacation;

@SuppressWarnings("serial")
public class NewVacationRequestSteps extends ScenarioSteps {
	StartEndDateNewVacation startEndDateNewVacation;

	VacationMenuPage vacationMenuPage;
	CalendarPage calendarPage;
	

	@Step
	public void new_request() {
		vacationMenuPage.click_new_request();
	}

	@Step
	public void select_start_date() {
		startEndDateNewVacation.click_startDate();
	}

	@Step
	public void select_end_date() {
		startEndDateNewVacation.click_endDate();
	}

	public void select_start_date(int month, int day, int year)
			throws ParseException {

		calendarPage.setDate(month, day, year);
	}

	@Step
	public void select_date(int month, int day, int year) throws ParseException {
		calendarPage.setDate(month, day, year);
	}

	@Step
	public void select_vacation_type() {
		startEndDateNewVacation.click_vacation_without_payment();
	}
	
	@Step
	public void save_request() {
		startEndDateNewVacation.click_save_button();
	}

	@Step
	public void select_duration_and_domain(String durAndDom) {
		startEndDateNewVacation.click_duration_and_domain(durAndDom);
	}
	
	@Step
	public void select_institution_name(String instName) {
		startEndDateNewVacation.click_institution_name(instName);
	}
	
	@Step
	public void select_special_vacation() {
		startEndDateNewVacation.click_special_vacation();
	}
	
	
	@Step
	public void select_special_reason() {
		startEndDateNewVacation.click_special_reason();
	}
	
	
	@Step
	public void selectSpecialVacationReason(String reason) {
		startEndDateNewVacation.selectSpecialVacationReason(reason);
	}
	
	
}