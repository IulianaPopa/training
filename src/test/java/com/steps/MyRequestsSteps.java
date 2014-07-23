package com.steps;

import java.util.List;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;

import com.pages.CalendarPage;
import com.pages.MyRequestsPage;
import com.pages.VacationMenuPage;

@SuppressWarnings("serial")
public class MyRequestsSteps extends ScenarioSteps {

	VacationMenuPage vacationMenuPage;
	CalendarPage calendarPage;
	MyRequestsPage myRequestsPage;

	@Step
	public void selectMyRequests() {
		vacationMenuPage.click_my_request();
	}
	
	@Step
	public void selectVacation() {
		myRequestsPage.clickHolidayCheckbox();
	}
	
	@Step
	public void applyFilter() {
		myRequestsPage.clickApplyButton();
	}
	
	@Step
	public void lookupResultsTable() {
		myRequestsPage.lookupResultsTable();
	}
	
	@Step
	public void selectVacation2() {
		myRequestsPage.clickFifthCheckbox();
	}
	
	@Step
	public void select_items_per_page(String value) {
		myRequestsPage.select_items_per_page(value);
		
	}
	
	@Step
	public void clickFifthCheckbox(){
		myRequestsPage.clickFifthCheckbox();
	}
	
	@Step
	 public void check_days_number_in_range(int lowValue, int highValue) {
	  List<String> daysList = myRequestsPage.get_days_number_list();

	  for (String val : daysList) {
	   Assert.assertTrue("Days Number not in selected range!!!", lowValue <= Integer.parseInt(val)
	       && highValue >= Integer.parseInt(val));
	  }
	}
	
	  @Step
		 public void check_holiday_list(String aaa) {
		  List<String> holidayList = myRequestsPage.get_holiday_list();

		  for (String val : holidayList) {
		   Assert.assertTrue("Holiday Requests not in table!!!", val.equals(aaa));
		  }
	  }
		
	
	
}
