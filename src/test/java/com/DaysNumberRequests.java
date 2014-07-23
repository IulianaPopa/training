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

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class DaysNumberRequests {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://192.168.1.68:9090/login")
	public Pages pages;

	@Steps
	public LoginSteps loginSteps;
	@Steps
	MyRequestsSteps myRequestsSteps;
	
	
	@Test
	public void createSimpleVacation() throws ParseException {
		loginSteps.login("andra.farcas", "andra");
		myRequestsSteps.selectMyRequests();
		myRequestsSteps.clickFifthCheckbox();
		myRequestsSteps.applyFilter();
		myRequestsSteps.select_items_per_page("75");
		myRequestsSteps.check_days_number_in_range(1, 6);
		
		
	}
}