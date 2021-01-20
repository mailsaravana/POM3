package com.amazon.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	// Elements
	By searchTxt=By.id("twotabsearchtextbox");
	By searchBtn=By.className("submit");

	//Constructor
	public HomePage(WebDriver driver)
	{		
		this.driver=driver;
	}
	
	//Method
	public String searchAmazon(String srchitem)
	{
		driver.findElement(searchTxt).sendKeys(srchitem);
		driver.findElement(searchTxt).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		String ss=driver.getTitle().toString();
		System.out.println(ss);
		return ss;
		
			
	}
	
	
	//
	
}
