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

	@FindBy(css = "input[value='CF'][type='radio']")
	private WebElementFacade vacationWithoutPayment;
	
	@FindBy(css = "input[name='duration']")
	private WebElementFacade durationAndDomain;

	@FindBy(css = "input[name='institution']")
	private WebElementFacade institutionName;
	
	@FindBy(css = "input[value='CS'][type='radio']")
	private WebElementFacade specialVacation;
	
	@FindBy(className=".vacationTypeChoice #_evovacation_WAR_EvoVacationportlet_specialReason>option[value='CHILD_BIRTH']")
	private WebElementFacade specialReason;
	
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_specialReason")
	private WebElementFacade specialVacationDdl;
	
	@FindBy(css = "input.aui-button-input")
	private WebElementFacade saveButton;

	@FindBy(css = "div.requiredComment")
	private WebElementFacade goToComment;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_commentContent")
	private WebElementFacade addComment;
	

	public void click_startDate() {
		element(startDate).waitUntilVisible();
		startDate.click();
	}

	public void click_endDate() {
		element(endDate).waitUntilVisible();
		endDate.click();
	}

	public void click_vacation_without_payment() {
		element(vacationWithoutPayment).waitUntilVisible();
		vacationWithoutPayment.click();
	}
	
	public void click_special_vacation() {
		element(specialVacation).waitUntilVisible();
		specialVacation.click();
	}
	
	public void click_save_button() {
		element(saveButton).waitUntilVisible();
		saveButton.click();
	}

	public void click_duration_and_domain(String durAndDom) {
		element(durationAndDomain).waitUntilVisible();
		durationAndDomain.click();
		durationAndDomain.sendKeys(durAndDom);
	}
	
	public void click_institution_name(String instName) {
		element(institutionName).waitUntilVisible();
		institutionName.click();
		institutionName.sendKeys(instName);
	}
	
	public void click_special_reason() {
		element(specialReason).waitUntilVisible();
		specialReason.click();
	}
	
	
	public void selectSpecialVacationReason(String reason){
		element(specialVacationDdl).selectByVisibleText(reason);
	}
	
	public void click_go_to_comment() {
		element(goToComment).waitUntilVisible();
		goToComment.click();
	}
	
	public void click_add_comment(String addComm) {
		element(addComment).waitUntilVisible();
		addComment.click();
		addComment.sendKeys(addComm);
	}
}
