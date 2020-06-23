package com.ch.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.ch.base.Base;
import com.ch.pages.ClaimsSubmissionPage;
import com.ch.pages.DashboardPage;
import com.ch.pages.LoginPage;
import com.ch.pages.PatientProfilePage;

import junit.framework.Assert;


public class ClaimsSubmissionTest extends Base{

	@Test
	public void ClaimsSubmission(){
		
		LoginPage lp = new LoginPage(driver);
		DashboardPage dp = new DashboardPage(driver);
		PatientProfilePage pp = new PatientProfilePage(driver);
		ClaimsSubmissionPage cp = new ClaimsSubmissionPage(driver);
		
		lp.openUrl("https://secure.outcomesmtm.com/index.cfm?event=login");
		lp.setUsername("amit.fernandes");
		lp.setPassword("Fuse@2020");
		lp.clickLogin();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertEquals(dp.dashboardPageUrl, driver.getCurrentUrl());	
		
		dp.enterSearchText("MTM0106");
		dp.clickSearchButton();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String s = dp.getCurrentUrl();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dp.verifySearch(s);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pp.clickClaimLink();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String p = dp.getCurrentUrl();
		pp.verifyClaimsPage(p);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cp.selectReason("Adherence - Needs check-in + 90-day fill");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cp.selectService("Patient consultation");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cp.selectOutcome("Unable to reach patient after 3 attempts");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement datePicker = driver.findElement(By.xpath("//*[@id='MTMserviceDate']"));
		
		datePicker.click();
		
		datePicker.sendKeys("06152020");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*cp.clickNextButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cp.selectMedication("Other");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement medInput = driver.findElement(By.xpath("//*[@id='currentMedName']"));
		medInput.sendKeys("VIT");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement medSelect = driver.findElement(By.xpath("//*[@id='ui-id-34']"));
		medSelect.click();
		cp.clickNextMedButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cp.clickContinueButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	
	
		
	}
	

}

/*
 <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.0.0-M4</version>
        <configuration>
          <suiteXmlFiles>
            <suiteXmlFile>testng.xml</suiteXmlFile>
          </suiteXmlFiles>
        </configuration>
      </plugin>
 */
