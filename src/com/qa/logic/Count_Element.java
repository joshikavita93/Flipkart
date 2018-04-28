package com.qa.logic;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.utility.utility_xpath;

public class Count_Element extends utility_xpath{

	
	WebDriver driver;
	JavascriptExecutor executor;
	
	public Count_Element(WebDriver driver)
	{
		this.driver=driver;
		
		System.setProperty("webdriver.gecko.driver", "F://geckodriver.exe");
		driver =new FirefoxDriver();
	}

	
	public void waitForLoad() throws InterruptedException {
		int i=1;
		while(i<10) {
			Thread.sleep(1000);
			if(executor.executeScript("return document.readyState").equals("complete")) {
				Thread.sleep(1000);
				break;
			}
		}
	}
	
	
 public void FindElement()
	 
	 {
		List<WebElement> element = driver.findElements(Xpath_CountElelment);
		
			int size=element.size();
			System.out.println(size);
			for (int i=0;i<size;i++)
			{
				
				element.get(i).click();
				String mobilename=element.get(i).getText();
				System.out.println(mobilename);

		
	   }
	 }


	
	
	/*Count_Element (){
		System.setProperty("webdriver.gecko.driver", "F://geckodriver.exe");
		driver =new FirefoxDriver();
	}*/
	
	
	/*public void switchBrowser() {
		for(String winHandle : driver.getWindowHandles()) {
		driver.switchTo().window(winHandle);
		}
	}*/
/*	
	public void clickLink() throws InterruptedException {

		driver.get("https://www.flipkart.com/");
		String mainWindow = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).sendKeys("Samsung Mobiles");
		
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).sendKeys(Keys.ESCAPE);
		
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div/div/div[1]/form/div/div[2]/button")).click();
		
		
		List<WebElement> element = driver.findElements(By.xpath("//div[contains(text(),'Samsung Galaxy ')]"));
		
		for(int i=0;i<element.size();i++) {
			Thread.sleep(2000);
			//element.get(i).click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",element.get(i));
			
			Thread.sleep(10000);
			switchBrowser();
			System.out.println(driver.getCurrentUrl());
			driver.close();
			driver.switchTo().window(mainWindow);
		}
		}*/

	
}
