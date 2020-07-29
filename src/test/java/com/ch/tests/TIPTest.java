package com.ch.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ch.base.Base;
import com.ch.pages.DashboardPage;
import com.ch.pages.LoginPage;
import com.ch.pages.PatientProfilePage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class TIPTest extends Base {
	
	@Test (description = "Verification of TIP workflow")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verification of the TIP workflow")
	@Story("TIP Workflow")
	
	public void TTest(){
		
		LoginPage lp = new LoginPage(driver, log); //here
		DashboardPage dp = new DashboardPage(driver, log); //here
		PatientProfilePage pp = new PatientProfilePage(driver, log);

		
		lp.openUrl("https://staging.outcomesmtm.com/index.cfm?event=login");

		lp.setUsername("autuser_pharm");
		lp.setPassword("Cardinal@1");
		lp.clickLogin();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		
		AssertJUnit.assertEquals(dp.dashboardPageUrl, driver.getCurrentUrl());
		
		 try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		//Test Run
				 
		 WebElement Sample = driver.findElement(By.xpath("//*[@id='ember445']/table/tr[5]/td[1]")); 
		 
		 Sample.click();
		
		 try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		/*pp.clickTipButton();
		
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 WebElement Option1 = driver.findElement(By.cssSelector("[tipresultid]")); ////*[@id="connect-tip-workflow-client"]/div[4]/label[4]/span
		
		Option1.click();
		
		WebElement nextButton = driver.findElement(By.xpath("//*[@id='connect-tip-workflow-client']/div[5]/button"));
		
		nextButton.click();
		
		*/
		
		}	
		
	}


