package com.amazon.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.amazon.Pages.LoginPageNew;

import Utility.BrowserFactory;

public class VerifyAmazonLoginNew {
	
	WebDriver driver;
	
	@Test
	public void checkValidUser()
	{
		String sUrl="https://www.amazon.co.uk/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=gbflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3Fref_%3Dnav_signin&switch_account=";
		
		// This will launch specific browser
		driver=BrowserFactory.startBrowser("Chrome", sUrl);
		
		// Created Page Object using Page Factory
		LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
		
		// Call the Method
		login_page.login_amazon("mailsaravana@gmail.com", "Intel125$");
		Assert.assertTrue(driver.getTitle().contains("Amazon.co.uk: Low Prices"), "User login unsuccessful!!");
		System.out.println("Page verified!!");
		
		//driver.quit();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
