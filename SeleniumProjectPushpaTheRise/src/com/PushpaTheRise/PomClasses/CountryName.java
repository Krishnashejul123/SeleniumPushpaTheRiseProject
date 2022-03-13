package com.PushpaTheRise.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountryName
{
	WebDriver driver;

	@FindBy(xpath="//th[text()='Country']")
	private WebElement CountryName;


public CountryName(WebDriver driver)
	{
		
		 this.driver=driver;
		 
		 PageFactory.initElements(driver, this);
	}

public void LoginButton()
{
	CountryName.click(); 
}
}