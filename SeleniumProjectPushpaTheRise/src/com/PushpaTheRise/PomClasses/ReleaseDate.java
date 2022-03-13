package com.PushpaTheRise.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReleaseDate

{
	
	WebDriver driver;
	
	@FindBy(xpath="//div[text()='Release date']")
	private WebElement reslesedate;
	
	
	public ReleaseDate(WebDriver driver)
	{
		
		 this.driver=driver;
		 
		 PageFactory.initElements(driver, this);
	}
	
	public void LoginButton()
	{
		reslesedate.click(); 
	}
	
	
	
	
	
	
	
}
