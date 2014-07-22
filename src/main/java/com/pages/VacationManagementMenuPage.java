package com.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class VacationManagementMenuPage extends PageObject {

	@FindBy(css = "a[href*='inbox']")
	private WebElementFacade inboxMenuItem;

	@FindBy(css = "a[href*='view-vacations']")
	private WebElementFacade viewVacationsMenuItem;

	public void click_inbox() {
		element(inboxMenuItem).waitUntilVisible();
		element(inboxMenuItem).click();
	}

	public void click_viewVacations() {
		element(viewVacationsMenuItem).waitUntilVisible();
		element(viewVacationsMenuItem).click();
	}
}
