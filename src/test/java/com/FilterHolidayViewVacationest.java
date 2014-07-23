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
import com.steps.MyRequestsSteps;
import com.steps.ViewVacationsSteps;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class FilterHolidayViewVacationest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://192.168.1.68:9090/login")
	public Pages pages;

	@Steps
	public LoginSteps loginSteps;

	@Steps
	MyRequestsSteps myRequestsSteps;

	
	@Steps
	ViewVacationsSteps viewVacationsSteps;
	
	@Test
	public void createSimpleVacation() throws ParseException {
		 loginSteps.login("andra.farcas", "andra");
		 viewVacationsSteps.viewVacations();
		 myRequestsSteps.selectVacation();
	     myRequestsSteps.applyFilter();
	     myRequestsSteps.lookupResultsTable();
	     myRequestsSteps.select_items_per_page("75");
	     viewVacationsSteps.check_type_request_in_range("Holiday");
		
	}
}