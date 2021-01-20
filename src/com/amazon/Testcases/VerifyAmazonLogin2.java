package com.amazon.Testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.Pages.HomePage;
import com.amazon.Pages.LoginPage;

public class VerifyAmazonLogin2 {
	
	
	@BeforeMethod
	public void setUp(){
	System.out.println("Before Method !!");
		
	}

	
	@Test(priority=2)
	public void verifyValidLogin(){
	
		String sUrl="https://www.amazon.co.uk/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=gbflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3Fref_%3Dnav_signin&switch_account=";
		System.setProperty("webdriver.chrome.driver", "G:/selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(sUrl);
		
		LoginPage login = new LoginPage(driver);  // Page
		login.loginToAmazon("mailsaravana@gmail.com", "Intel125$");
		
		driver.quit();
	}
	
	/*
	@Test(priority=1)
	public void searchaProduct(){
	
		//Driver Init
		String sUrl="https://www.amazon.co.uk/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=gbflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3Fref_%3Dnav_signin&switch_account=";
		System.setProperty("webdriver.chrome.driver", "G:/selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(sUrl);
		
		//Data assign
		String SrchWord="AMD APU";
		String uuser,ppass;
		uuser="mailsaravana@gmail.com";
		ppass="Intel125$";
		

		// Page Init
		LoginPage login = new LoginPage(driver);  
		HomePage homepg = new HomePage(driver);
		
		// Actions
		login.loginToAmazon(uuser, ppass);
		homepg.searchAmazon(SrchWord);
		
		driver.quit();
	}
	
	*/
	
	
	
	

}
