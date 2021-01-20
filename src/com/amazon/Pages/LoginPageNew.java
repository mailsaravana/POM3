package com.amazon.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPageNew {
	
	
	WebDriver driver;
	
	public LoginPageNew(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	//Webelements
	@FindBy(id="ap_email") 
	@CacheLookup
	WebElement username; 
	
	
	@FindBy(how=How.ID,using="ap_password") 
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.ID,using="signInSubmit") 
	WebElement loginBtn;
	
	
	
	public void login_amazon(String suid, String spass)
	{
		username.sendKeys(suid);
		password.sendKeys(spass);
		loginBtn.click();
		
		
	}

}
