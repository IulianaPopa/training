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
import com.steps.FreeDaysHistorySteps;
import com.steps.LoginSteps;
import com.steps.MyFreeDaysSteps;
import com.steps.MyRequestsSteps;
import com.steps.NewVacationRequestSteps;
import com.steps.InboxSteps;
import com.steps.ViewVacationsSteps;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class HistoryVacationRequests {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://192.168.1.68:9090/login")
	public Pages pages;

	@Steps
	public LoginSteps loginSteps;

	@Steps
	NewVacationRequestSteps newVacationRequestSteps;

	@Steps
	MyRequestsSteps myRequestsSteps;
	
	@Steps
	MyFreeDaysSteps myFreeDaysSteps;
	
	@Steps
	FreeDaysHistorySteps freeDaysHistorySteps;
	
	@Steps
	InboxSteps inboxSteps;
	
	@Steps
	ViewVacationsSteps viewVacationsSteps;
	@Test
	public void createSimpleVacation() throws ParseException {
		loginSteps.login("andra.farcas", "andra");
		newVacationRequestSteps.new_request();
		newVacationRequestSteps.select_start_date();
		newVacationRequestSteps.select_date(7, 17, 2014);
		newVacationRequestSteps.select_end_date();
		newVacationRequestSteps.select_date(7, 18, 2014);
		myRequestsSteps.my_request();
		myFreeDaysSteps.my_free_days();
		freeDaysHistorySteps.free_days_history();
		inboxSteps.inbox();
		viewVacationsSteps.viewVacations();
		

	}
}