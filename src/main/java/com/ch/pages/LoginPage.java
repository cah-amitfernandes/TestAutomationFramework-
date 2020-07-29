package com.ch.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;

public class LoginPage extends BasePageObject {
	
	
	private By usernameLocator = By.xpath("/html//input[@id='username']");
	private By passwordLocator = By.cssSelector("input#password");
	private By loginButtonLocator = By.cssSelector("a#login");
	private By errorMessageLocator = By.cssSelector("p#errorSummaryMsg");


	public LoginPage(WebDriver driver, Logger log) {
		super(driver, log);
	}
	
	
	@Step("Entering username")
	public void setUsername(String username){
		type(username, usernameLocator);
	}
	
	@Step("Entering password")
	public void setPassword(String password){
		type(password, passwordLocator);
	}
	
	@Step("Clicking login button")
	public void clickLogin(){
		click(loginButtonLocator);
	}
	
	public boolean errorMessage(){
		if(errorMessageLocator != null)
			return true;
		else
			return false;
	}
	
	

}
