package com.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class VacationMenuPage extends PageObject {

    @FindBy(css="a[href*='new-request']")
    private WebElementFacade newRequestMenuItem;
    
    public void click_new_request() {
        element(newRequestMenuItem).waitUntilVisible();
        element(newRequestMenuItem).click();
    }
    
}