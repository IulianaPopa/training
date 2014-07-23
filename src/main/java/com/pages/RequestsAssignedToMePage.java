package com.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class RequestsAssignedToMePage extends PageObject {

  
    

    @FindBy(css = "#_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainer_col-rowChecker_row-1 > input")
    private WebElementFacade selectRequest; 
    
    
    @FindBy(css="input[value='Approve']")
    private WebElementFacade approveButton;
    
    @FindBy(css="input[value='Reject']")
    private WebElementFacade rejectButton;
    
    public void click_selectRequest() {
    	element(selectRequest).waitUntilVisible();
    	selectRequest.click();
    }
  
  
    public void click_approve_button() {
    	element(approveButton).waitUntilVisible();
    	approveButton.click();
    }	
    
    public void click_reject_button() {
    	element(rejectButton).waitUntilVisible();
    	rejectButton.click();
    }	
    
}
