package com.ch.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePageObject {

	public String dashboardPageUrl = "https://secure.outcomesmtm.com/index.cfm#/dashboard";
	private By searchboxLocator = By.cssSelector("input#patient-search-input");
	private By searchButtonLocator = By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div/div[1]/div[2]/div/a/div");

	public DashboardPage(WebDriver driver) {
		super(driver);
	}

	public void enterSearchText(String searchtext) {
		type(searchtext, searchboxLocator);
	}

	public void clickSearchButton() {
		click(searchButtonLocator);
	}
	
	public boolean verifyDashboardUrl(){
		if(getCurrentUrl() == dashboardPageUrl)
			return true;
		else
			return false;
	}
	
	public boolean verifySearch(String url){
		if(url.contains("Profile")){
			return true;
		}else
			return false;
		}
	
	public String getSearchText(){
		return driver.findElement(By.cssSelector("input#patient-search-input")).getAttribute("value");
	}
	
	
}
