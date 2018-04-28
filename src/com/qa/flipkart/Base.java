package com.qa.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.logic.Count_Element;
import com.qa.logic.Search_Mobiles;
import com.qa.logic.login;

public class Base {
	
	static WebDriver driver;
	static login objlogin;
	static Search_Mobiles objSearchMobiles;
	static Count_Element objCountElement;
	
	static String url="http://www.flipkart.com/";
	static String UserName="9711807309";
	static String Password="26june1993";
	static String SearchElement="samsung mobiles";
	
	

	@BeforeTest
	public void setUP(){

		System.setProperty("webdriver.gecko.driver", "C://Software//geckodriver-v0.19.1-win64//geckodriver.exe");
		driver = new FirefoxDriver();

	      }
	
	@Test(priority=1)
	public void launchUrl() {
		driver.get("http://www.flipkart.com/");
			//driver.get(OR.URL);
		}
		
	@Test(priority=2)
	public void Login() throws InterruptedException {

		//Base.setting();
		objlogin= new login(driver);
	
		Thread.sleep(3000);
		objlogin.SendUsername(UserName);
		objlogin.SendPassword(Password);
		
		objlogin.Submit();
	/*	objSearchMobiles = new Search_Mobiles(driver);
		objCountElement=new Count_Element(driver);
		//objlogin.LoginFunction(UserName, Password);
		Thread.sleep(4000);
		objSearchMobiles.ElementSearchFunction(SearchElement);
         Thread.sleep(5000);
		objCountElement.FindElement();*/
		//objCountElement.clickLink();
		//objAddToCartElement.base_AddToCart();
	}

}
