package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class VacationManagementMenuPage extends PageObject {

	@FindBy(css = "a[href*='view-vacations']")
	private WebElementFacade viewVacationsMenuItem;


		public void click_viewVacations() {
		element(viewVacationsMenuItem).waitUntilVisible();
		element(viewVacationsMenuItem).click();
	}
		
		  public List<String> get_type_request_list(){
			   List<WebElement> typeRequestList = getDriver().findElements(By.cssSelector("td[class*='type']"));
			   
			   List<String> stringList = new ArrayList<String>();
			   
			   for (WebElement dayElem : typeRequestList){
				   stringList.add(dayElem.getText());
			   }
			   return stringList;
		   }
}
