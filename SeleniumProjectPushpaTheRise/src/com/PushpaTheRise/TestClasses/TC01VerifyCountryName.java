package com.PushpaTheRise.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01VerifyCountryName extends BaseClass
{
 

  @Test
  public void CountryName()
  {
	  String actualTitle="Pushpa: The Rise - Wikipedia";
		String expectedTitle=driver.getTitle();
		
		Assert.assertEquals(actualTitle,expectedTitle);
		
}
}