package com.ch.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.ch.base.Base;
import com.ch.pages.DashboardPage;
import com.ch.pages.LoginPage;



public class FailedCMRTest extends Base {

	public FailedCMRTest() {

				
	}
	
	@Test
	public void FailedCMR1(){
		
		LoginPage lp = new LoginPage(driver);
		DashboardPage dp = new DashboardPage(driver);
		
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
		
		
		AssertJUnit.assertEquals(dp.dashboardPageUrl, driver.getCurrentUrl());
		
		 try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		//Test Run
				 
		 WebElement Sample = driver.findElement(By.xpath("//*[@id='ember429']/table/tr[6]/td[1]"));
		 
		 Sample.click();
		
		 try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 WebElement UCMRlink = driver.findElement(By.xpath("//*[@id='documentUnsuccessfulCmrButton']"));
		 
		 UCMRlink.click();
		 
		 try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 WebElement Option1 = driver.findElement(By.cssSelector("md-radio-button:nth-of-type(1)  .md-off"));
		 try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 Option1.click();
		 
		 try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 WebElement dateSelector = driver.findElement(By.xpath("//*[@id='input-paperInputMask']"));
		 
		 dateSelector.sendKeys("06152020");
		 
		 try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 WebElement uCMRButton = driver.findElement(By.xpath("//*[@id='btnSubmit']"));
		 
		 uCMRButton.click();
		 
		 try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
	}


