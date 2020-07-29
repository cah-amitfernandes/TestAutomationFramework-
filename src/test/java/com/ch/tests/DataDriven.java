package com.ch.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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


public class DataDriven extends Base {
	

	
	@Test
	public void DDTest() throws IOException{
		
		XSSFCell cell;
		XSSFRow row = null;

		//FilePath
		String filePath = "./data/SampleBook.xlsx";
		//Loading data
		try {
			FileInputStream fs = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Accessing Sheet
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		

		//Accessing cell data
		for(int i = 0; i<rowCount+1; i++){
			
			Row rowNow = sheet.getRow(i);
			
			for (int j = 0; j< row.getLastCellNum(); j++){
				
				//The Target element
				
			}
			
			
			
		}

	}
	
	
	

}
