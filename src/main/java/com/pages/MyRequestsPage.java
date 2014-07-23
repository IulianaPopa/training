package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;
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
    
    @FindBy(css="input[value='FIFTH'][type='checkbox']")
    private WebElementFacade fifthCheckbox;
    
    @FindBy(css = "select[name*='itemsPerPage']")
    private WebElementFacade selectItemsPerPage;
    
    
    
   
    
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
    public void clickFifthCheckbox() {
    	element(fifthCheckbox).waitUntilVisible();
    	fifthCheckbox.click();
    }

	public void select_items_per_page(String value) {
		selectItemsPerPage.selectByValue(value);
		
		
	}
   public List<String> get_days_number_list(){
	   List<WebElement> daysList = getDriver().findElements(By.cssSelector("td[class*='day.number']"));
	   
	   List<String> stringList = new ArrayList<String>();
	   
	   for (WebElement dayElem : daysList){
		   stringList.add(dayElem.getText());
	   }
	   return stringList;
   }
   public List<String> get_holiday_list(){
	   List<WebElement> holidaysList = getDriver().findElements(By.cssSelector("td[class*='type']"));
	   
	   List<String> stringList = new ArrayList<String>();
	   
	   for (WebElement historyElem : holidaysList){
		   stringList.add(historyElem.getText());
	   }
	   return stringList;
   }
}
