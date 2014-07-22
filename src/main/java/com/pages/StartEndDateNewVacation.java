package com.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class StartEndDateNewVacation extends PageObject {

	@FindBy(css = "input[name='startDate']")
	private WebElementFacade startDate;

	@FindBy(css = "input[name='endDate']")
	private WebElementFacade endDate;

	public void click_startDate() {
		element(startDate).waitUntilVisible();
		startDate.click();
	}

	public void click_endDate() {
		element(endDate).waitUntilVisible();
		endDate.click();
	}

}
