package com.amazon.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	
	By username=By.id("ap_email");
	By password=By.id("ap_password");
	By loginButton=By.id("signInSubmit");
	
	
	public LoginPage(WebDriver driver)
	{		
		this.driver=driver;
		
	}
	
	
	public void loginToAmazon(String user, String pass){
		
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
	
	/*
	public void typeUserName(String uid){
		driver.findElement(username).sendKeys(uid);
		//"mailsaravana@gmail.com"
	}
	
	public void typePassword(String pass){
		driver.findElement(password).sendKeys(pass);
		//"Intel125$"
	}
	
	public void clickOnLoginButton(){
		driver.findElement(loginButton).click();
		
	}
	*/
	
	
}
