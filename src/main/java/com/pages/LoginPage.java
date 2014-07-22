package com.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class LoginPage extends PageObject {

    @FindBy(css="input[type='text']")
    private WebElementFacade username;
    
    @FindBy(css="input[type='password']")
    private WebElementFacade password;

    @FindBy(className="aui-button-input-submit")
    private WebElementFacade submitButton;

    public void enter_username(String user) {
        element(username).waitUntilVisible();
        element(username).sendKeys(user);
    }
    
    public void enter_password(String pass) {
        element(password).waitUntilVisible();
        element(password).sendKeys(pass);
    }
    
    public void click_submit() {
    	submitButton.click();
    }
}