package com.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class VacationMenuPage extends PageObject {

	@FindBy(css = "a[href*='new-request']")
	private WebElementFacade newRequestMenuItem;

	@FindBy(css = "a[href*='my-free-days']")
	private WebElementFacade myFreeDaysItem;

	@FindBy(css = "a[href*='free-days-history']")
	private WebElementFacade freeDaysHistoryItem;

	@FindBy(css = "a[href*='my-requests']")
	private WebElementFacade myRequestsMenuItem;

	public void click_new_request() {
		element(newRequestMenuItem).waitUntilVisible();
		element(newRequestMenuItem).click();
	}

	public void click_my_request() {
		element(myRequestsMenuItem).waitUntilVisible();
		element(myRequestsMenuItem).click();
	}

	public void click_my_free_days() {
		element(myFreeDaysItem).waitUntilVisible();
		element(myFreeDaysItem).click();
	}

	public void click_free_days_history() {
		element(freeDaysHistoryItem).waitUntilVisible();
		element(freeDaysHistoryItem).click();
	}

}
