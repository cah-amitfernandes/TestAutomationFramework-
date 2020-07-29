package com.ch.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ClaimsSubmissionPage extends BasePageObject {

	private By reasonDropdownLocator = By.xpath("//*[@id='reasonCode']");
	private By serviceDropdownLocator = By.cssSelector("select#actionCode");
	private By outcomeDropdownLocator = By.cssSelector("select#result");
	private By serviceDateLocator = By.cssSelector("input#MTMserviceDate");
	private By nextButtonLocator = By.cssSelector("a#aboutMTMNextButton");
	private By medicationDropdownLocator = By.cssSelector("select#currentMedfromHistory");
	private By nextMedButtonLocator = By.cssSelector("a#currentMedNextButton");
	private By continueButtonLocator = By.cssSelector("a#continueReview");

	public ClaimsSubmissionPage(WebDriver driver, Logger log) {
		super(driver, log);
	}
	
	public void selectReason(String selection){
		Select dropdown = new Select(driver.findElement(reasonDropdownLocator));
		dropdown.selectByVisibleText(selection);
	}
	
	public void selectService(String selection){
		Select dropdown = new Select(driver.findElement(serviceDropdownLocator));
		dropdown.selectByVisibleText(selection);
	}
	
	public void selectOutcome(String selection){
		Select dropdown = new Select(driver.findElement(outcomeDropdownLocator));
		dropdown.selectByVisibleText(selection);
	}
	
	public void selectMedication(String selection){
		Select dropdown = new Select(driver.findElement(medicationDropdownLocator));
		dropdown.selectByVisibleText(selection);
	}
	
	public void setDate(String date){
		click(serviceDateLocator);
		type(date, serviceDateLocator);
	}
	
	public void clickNextButton(){
		click(nextButtonLocator);
	}
	
	public void clickNextMedButton(){
		click(nextMedButtonLocator);
	}
	
	public void clickContinueButton(){
		click(continueButtonLocator);
	}
}
