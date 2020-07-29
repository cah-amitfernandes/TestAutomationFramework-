package com.ch.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.ch.base.Base;
import com.ch.pages.ClaimsSubmissionPage;
import com.ch.pages.DashboardPage;
import com.ch.pages.LoginPage;
import com.ch.pages.PatientProfilePage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


public class ClaimsSubmissionTest extends Base{

	@Test(description = "Verification of Claims Submission")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verification of Claims Submission")
	@Story("Claims Submission")
	public void ClaimsSubmission(){
		
		LoginPage lp = new LoginPage(driver, log);
		DashboardPage dp = new DashboardPage(driver, log);
		PatientProfilePage pp = new PatientProfilePage(driver, log);
		ClaimsSubmissionPage cp = new ClaimsSubmissionPage(driver, log);
		
		lp.openUrl("https://staging.outcomesmtm.com/index.cfm?event=login");

		lp.setUsername("autuser_pharm");
		lp.setPassword("Cardinal@1");
		lp.clickLogin();
		try {
			Thread.sleep(6000);
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
		
		datePicker.sendKeys("07022020");
		
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
