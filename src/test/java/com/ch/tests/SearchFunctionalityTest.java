package com.ch.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.ch.base.Base;
import com.ch.pages.DashboardPage;
import com.ch.pages.LoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class SearchFunctionalityTest extends Base{
	
	@Test (description = "Verification of Search functionality")
	@Severity(SeverityLevel.NORMAL)
	@Description("Verification of the Search Functionality")
	@Story("Search Functionality")
	public void SearchTestByID(){
	
	LoginPage lp = new LoginPage(driver, log);
	DashboardPage dp = new DashboardPage(driver, log);
	
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
	
	dp.enterSearchText("35f1d50c-5026-488e-ad44-3ed190aaf811");
	dp.clickSearchButton();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String s = dp.getCurrentUrl();
	
	dp.verifySearch(s);
	
	}
	
	/*@Test
	public void SearchTestByLastname(){
	
	LoginPage lp = new LoginPage(driver);
	DashboardPage dp = new DashboardPage(driver);
	
	lp.openUrl("https://staging.outcomesmtm.com/");
	lp.setUsername("autuser_pharm");
	lp.setPassword("Cardinal@pharm");
	lp.clickLogin();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Assert.assertEquals(dp.dashboardPageUrl, driver.getCurrentUrl());	
	
	dp.enterSearchText("Korpal");
	dp.clickSearchButton();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String s = dp.getCurrentUrl();
	
	dp.verifySearch(s);
	
	}
	
	@Test
	public void SearchTestByDob(){
	
	LoginPage lp = new LoginPage(driver, log);
	DashboardPage dp = new DashboardPage(driver, log);
	
	lp.openUrl("https://secure.outcomesmtm.com/index.cfm?event=login");
	lp.setUsername("amit.fernandes");
	lp.setPassword("Fuse@2020");
	lp.clickLogin();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Assert.assertEquals(dp.dashboardPageUrl, driver.getCurrentUrl());	
	
	dp.enterSearchText("08/01/1981");
	dp.clickSearchButton();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String s = dp.getCurrentUrl();
	
	dp.verifySearch(s);
	
	}*/
}
