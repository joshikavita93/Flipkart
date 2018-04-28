package com.qa.utility;

import org.openqa.selenium.By;

public class utility_xpath {

	
	
	public static By Xpath_username = By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
			
			//("(//form/div/input[@autocomplete='off'])[1]");

	public static By Xpath_password = By.xpath("(//form/div/input[@autocomplete='off'])[2]");
	/*public static By Xpath_submit = By.xpath("(//button[@type='submit'])[2]");

	public static By Xpath_ElementSearch=By.xpath("//input[@class='LM6RPg']");
	public static By Xpath_Search=By.xpath("//button[@class='vh79eN']");
public static By Xpath_CountElelment= By.xpath("//div[1]/div[1][contains(text(),'Samsung ')]");
*/
	public static By Xpath_submit = By.xpath("(//form/div[3]/button[@type='submit'])");

	public static By Xpath_ElementSearch=By.xpath("//input[contains(@title,'Search for')]");
	public static By Xpath_Search=By.xpath("//div/div[2]/button[@type='submit']");
public static By Xpath_CountElelment= By.xpath("//div[1]/div[1][contains(text(),'Samsung ')]");


}
