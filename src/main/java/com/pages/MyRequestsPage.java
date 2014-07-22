package com.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class MyRequestsPage extends PageObject {

    @FindBy(css="input[name='HOLIDAYCheckbox']")
    private WebElementFacade hOLIDAYCheckbox;
    
    @FindBy(css="input[name='applyButton']")
    private WebElementFacade applyButton;
        
    public void click_holidaycheckbox() {
    	element(hOLIDAYCheckbox).waitUntilVisible();
    	hOLIDAYCheckbox.click();
    }
  
  
    public void click_apply_button() {
    	element(applyButton).waitUntilVisible();
    	applyButton.click();
    }	
   
    
}
