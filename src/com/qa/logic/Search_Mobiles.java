package com.qa.logic;

import org.openqa.selenium.WebDriver;

import com.qa.utility.utility_xpath;


public class Search_Mobiles extends utility_xpath{
	
WebDriver driver;
	
	public Search_Mobiles(WebDriver driver)
	
	{
		
		this.driver=driver;
		
	}
	
	
	public void Search(String Element)
	
	{
		driver.findElement(utility_xpath.Xpath_ElementSearch).sendKeys(Element);
		
		
	}
	
	public void SubmitElement()
	
	{
		
		driver.findElement(utility_xpath.Xpath_Search).submit();
	}
	
	public void ElementSearchFunction(String searchElement)

	{

		Search(searchElement);
	
		SubmitElement();
		
		

	}


	


}
