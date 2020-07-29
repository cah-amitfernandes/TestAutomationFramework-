package com.ch.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ch.base.Base;
import com.ch.pages.DashboardPage;
import com.ch.pages.LoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


public class LoginTest extends Base {
	
	
	@Test(priority=1, description = "Verifying login functionality")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Verificaton of Login Functionality")
	@Story("Login Functionality")
	public void postiveLoginTest(){
		
	LoginPage lp = new LoginPage(driver, log); //here
	DashboardPage dp = new DashboardPage(driver, log); //here
	
	lp.openUrl("https://staging.outcomesmtm.com/index.cfm?event=login");

	lp.setUsername("autuser_pharm");
	lp.setPassword("Cardinal@1");
	lp.clickLogin();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		
		e.printStackTrace();
	}
	
	
	AssertJUnit.assertEquals(dp.dashboardPageUrl, driver.getCurrentUrl());	
	}
	
	@Test(priority=2)
	@Severity(SeverityLevel.NORMAL)
	@Description("Verification of login functionality - negative")
	@Story("Login Functionality (Negative)")
	public void negativeLoginTest(){
		
		LoginPage lp = new LoginPage(driver, log);
		lp.openUrl("https://staging.outcomesmtm.com/index.cfm?event=login");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lp.setUsername("autuser");
		lp.setPassword("Cardinal");
		lp.clickLogin();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lp.errorMessage();
		}	
	

}
