package com.qa.logic;

import org.openqa.selenium.WebDriver;

import com.qa.utility.utility_xpath;

public class login extends utility_xpath {
	
	WebDriver driver;
	
	
	public login(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void SendUsername(String username){
		
		driver.findElement(utility_xpath.Xpath_username).sendKeys(username);
		
	}
	
public void SendPassword(String password){
	
	driver.findElement(utility_xpath.Xpath_password).sendKeys(password);
		
}


public void Submit(){
		
	driver.findElement(utility_xpath.Xpath_submit).click();
		
		
	}


/*public void LoginFunction(String userName, String password) {
	// TODO Auto-generated method stub

	SendUsername(userName);
	SendPassword(password);
	Submit();
}*/

}
