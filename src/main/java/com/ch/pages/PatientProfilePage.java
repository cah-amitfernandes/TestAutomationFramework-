package com.ch.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PatientProfilePage extends BasePageObject {

	private By patientIdLocator = By.id("mtmId");
	private By startLinkLocator = By.cssSelector("p#startClaimLink");
	private By firstOptionLocator = By.xpath("md-radio-button:nth-of-type(1)  .md-off");
	private By dateSelector = By.xpath("//*[@id='input-paperInputMask']");
	private By TipButtonLocator = By.xpath("//*[@id='ember558']/div/div/span");
			
	public PatientProfilePage(WebDriver driver, Logger log) {
		super(driver, log);
	}
	
	public String getPatientId(){
		return driver.findElement(By.id("mtmId")).getAttribute("value");
	}
	
	public void clickClaimLink(){
		click(startLinkLocator);
	}
	
	public boolean verifyClaimsPage(String url){
		if(url.contains("claimSubmit")){
			return true;
		}else
			return false;
		}
	
	public void clickFirstOption(){
		click(firstOptionLocator);
	}
	
	public void clickTipButton(){
		click(TipButtonLocator);
	}

}
