package com.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class VacationMenuPage extends PageObject {

    @FindBy(css="a[href*='new-request']")
    private WebElementFacade newRequestMenuItem;
    
    
    @FindBy(css="input[name='startDate']")
    private WebElementFacade startDate;
    
    @FindBy(css="input[name='endDate']")
    private WebElementFacade endDate;
    
    public void click_new_request() {
        element(newRequestMenuItem).waitUntilVisible();
        element(newRequestMenuItem).click();
    }
    
    public void click_startDate() {
    	element(startDate).waitUntilVisible();
    	startDate.click();
    }
  
  
    public void click_endDate() {
    	element(endDate).waitUntilVisible();
    	endDate.click();
    }	
   
    
}
