package com.PushpaTheRise.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	  WebDriver driver;

		
		@BeforeClass
		public void Setup() 
		{
			System.setProperty("webdriver.chrome.driver",
					 "C:\\Users\\freq\\Selenium\\Chrome\\chromedriver.exe");
			 
			 driver= new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		
		@AfterClass
		public void TearDawn()
		{
			driver.quit();
		}
		

}
