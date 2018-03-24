package com.org.TripAdvisor.TripAdvisor_Automation;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;   
import org.testng.annotations.Test;   
import org.testng.annotations.AfterTest;
import PageObjects.HomePage;
import Utility.Constants;
import Utility.ExcelUtils;
import Utility.Log;



public class FlightOrder {
	public static WebDriver driver;

	

	@BeforeTest
	public void PreReq() {
		System.setProperty("webdriver.chrome.driver", "D:\\Hp\\Selenium\\chromedriver_win32\\chromedriver.exe");
		DOMConfigurator.configure("log4j.xml");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get(Constants.URL);

	}



@Test
public void TestCase2() throws Exception {
	 ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData,"Sheet1");
	
	DOMConfigurator.configure("log4j.xml");	
	driver.get(Constants.URL);
	Screen screen = new Screen();


	
	
	screen.click(HomePage.Flights_Btn(driver));
	Log.info("Flight Option selected from Main Menu");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[starts-with(@class,'orig')]//*[@tabindex='4']")).sendKeys("LAX");
	driver.findElement(By.xpath("//div[starts-with(@class,'orig')]//*[@tabindex='4']")).click();
	Log.info("Flight from parameter entered");
	
	Thread.sleep(5000);
	
	
	driver.findElement(By.xpath("//div[starts-with(@class,'dest')]//*[@tabindex='5']")).sendKeys("BOM");
	driver.findElement(By.xpath("//div[starts-with(@class,'dest')]//*[@tabindex='5']")).click();
	Log.info("Flight to parameter entered");
	Thread.sleep(5000);
	

	screen.click(HomePage.FindFlights_Btn(driver));
	Log.info("Finc flight option selected");
	Thread.sleep(1000);
	
	


	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/span/div[2]")).click();
	Log.info("Flight deal selected");
	
	Thread.sleep(1000);
	
	JavascriptExecutor scroller = (JavascriptExecutor) driver;
	scroller.executeScript("window.scrollBy(0,250)", "");


	
	driver.findElement(By.xpath("//*[@id='taplc_flight_list_0']/div[1]/div[2]/div[3]/div/div[1]/div[1]/div[2]/div[1]/div[3]/span")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/span/div[1]/div/div/div[4]/div[5]/div[1]/div/span/span/span")).click();
	
	Thread.sleep(1000);
	
	
	String abc = driver.getCurrentUrl();
	
	Thread.sleep(3000);
	
	if(abc.contains("vayama")|| abc.contains("emirates") || abc.contains("tripadvisor")){
		System.out.println("Test Case Passed");
		ExcelUtils.setCellData("Pass", 1, 3);
		
	}
	
	else{
		System.out.println("Test Case Failed");
		ExcelUtils.setCellData("Fail", 1, 3);
		
	}
	
}
}

