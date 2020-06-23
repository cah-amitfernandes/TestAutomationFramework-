package com.ch.base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriverFactory {
	
	private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	private String browser;
	private Logger log;
	
	public BrowserDriverFactory(String browser, Logger log){
		this.browser = browser.toLowerCase();
		this.log = log;
	}
	
	public WebDriver createDriver(){
		
		log.info("Create Driver: " +browser);
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/amit.fernandes/Desktop/Selenium/chromedriver");
			driver.set(new ChromeDriver());
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/amit.fernandes/Desktop/Selenium/geckodriver");
			driver.set(new FirefoxDriver());
		}
		return driver.get();
	}

}
