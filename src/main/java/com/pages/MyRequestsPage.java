package com.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class MyRequestsPage extends PageObject {

    @FindBy(css="input[value='HOLIDAY'][type='checkbox']")
    private WebElementFacade holidayCheckbox;
    
    @FindBy(css="input.aui-button-input")
    private WebElementFacade applyButton;
        
    
    @FindBy(css="tr.portlet-section-header.results-header")
    private WebElementFacade resultsTable;
    
    public void clickHolidayCheckbox() {
    	element(holidayCheckbox).waitUntilVisible();
    	holidayCheckbox.click();
    }
  
  
    public void clickApplyButton() {
    	element(applyButton).waitUntilVisible();
    	applyButton.click();
    }	
   
    public void lookupResultsTable() {
    	element(resultsTable).waitUntilVisible();
    	element(resultsTable).shouldBePresent();
    }
   
   
}
