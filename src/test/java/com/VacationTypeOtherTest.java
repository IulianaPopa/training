package com;

import java.text.ParseException;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.requirements.Application;
import com.steps.LoginSteps;
import com.steps.NewVacationRequestSteps;
@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class VacationTypeOtherTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://192.168.1.68:9090/login")
	public Pages pages;

	@Steps
	public LoginSteps loginSteps;

	@Steps
	NewVacationRequestSteps newVacationRequestSteps;
	@Test
	public void createSimpleVacation() throws ParseException {
		loginSteps.login("andra.farcas", "andra");
		newVacationRequestSteps.new_request();
		newVacationRequestSteps.select_start_date();
		newVacationRequestSteps.select_date(4, 12, 2015);
		newVacationRequestSteps.select_end_date();
		newVacationRequestSteps.select_date(4, 12, 2015);
		newVacationRequestSteps.select_vacation_type();
		newVacationRequestSteps.select_special_vacation();
//		newVacationRequestSteps.select_special_reason();
		newVacationRequestSteps.selectSpecialVacationReason("Other");
		newVacationRequestSteps.select_go_to_comment();
		newVacationRequestSteps.select_add_comment("jhskdhshdskhdshd");
		newVacationRequestSteps.select_my_request();
		newVacationRequestSteps.select_Vacation();
		newVacationRequestSteps.applyFilter();
		newVacationRequestSteps.lookupResultsTable();
		newVacationRequestSteps.save_request();

	}
	
}