package com.amazon.Testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.Pages.HomePage;
import com.amazon.Pages.LoginPage;

public class VerifyAmazonLoginDataProvider {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
	System.out.println("Before Method !!");
		
	}

	
	@Test(dataProvider="amazonData")
	public void verifyValidLogin(String uuser, String upass) throws InterruptedException{
	
		String sUrl="https://www.amazon.co.uk/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=gbflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3Fref_%3Dnav_signin&switch_account=";
		System.setProperty("webdriver.chrome.driver", "G:/selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(sUrl);
		
		driver.findElement(By.id("ap_email")).sendKeys(uuser);
		driver.findElement(By.id("ap_password")).sendKeys(upass);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Amazon.co.uk: Low Prices"), "Login Failed");
		/*
		LoginPage login = new LoginPage(driver);  // Page
		login.loginToAmazon("mailsaravana@gmail.com", "Intel125$");
		*/
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	@DataProvider(name="amazonData") 
	public Object[][] passData()
	{
		Object[][] data  =new Object[3][2];
		
		data[0][0]="admin";
		data[0][1]="pass";
		
		data[1][0]="mailsaravana@gmail.com";
		data[1][1]="Intel125$";
		
		data[2][0]="admin";
		data[2][1]="pass";
		
		return data;
		
	}
	
	
	

}
