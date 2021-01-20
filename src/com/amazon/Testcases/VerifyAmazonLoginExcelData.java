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

import lib.ExcelDataConfig;

public class VerifyAmazonLoginExcelData {
	
	WebDriver driver;
	String Excelpath="D:\\Eclipse\\New folder\\POM2\\src\\TestData\\InputData.xlsx";
	
	@BeforeMethod
	public void setUp(){
	System.out.println("Before Method !!");
	
	String sUrl="https://www.amazon.co.uk/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=gbflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3Fref_%3Dnav_signin&switch_account=";
	System.setProperty("webdriver.chrome.driver", "G:/selenium/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(sUrl);
		
	}

	/*
	@Test(dataProvider="amazonData")
	public void verifyValidLogin(String uuser, String upass) throws InterruptedException{
			
		driver.findElement(By.id("ap_email")).sendKeys(uuser);
		driver.findElement(By.id("ap_password")).sendKeys(upass);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("Amazon.co.uk: Low Prices"), "Login Failed");
	}
	*/
	
	
	
	@Test(dataProvider="amazonData2")
	public void searchaProduct(String uuser, String ppass, String SrchWord) throws InterruptedException{

		// Page Init
		LoginPage login = new LoginPage(driver);  
		HomePage homepg = new HomePage(driver);
		
		// Actions
		login.loginToAmazon(uuser, ppass);
		homepg.searchAmazon(SrchWord);
		
		driver.quit();
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	@DataProvider(name="amazonData2") 
	public Object[][] passData2()
	{
		//String Excelpath="D:\\Eclipse\\New folder\\POM\\src\\TestData\\InputData.xlsx";
		ExcelDataConfig config=new ExcelDataConfig(Excelpath);
	
		int rows=config.getRowCount(0);
		Object[][] data  =new Object[rows][3];
		
		for(int i=0; i <rows; i++)
		{
			data[i][0]=config.getData(0, i, 0);
			data[i][1]=config.getData(0, i, 1);
			data[i][2]=config.getData(0, i, 2);
		}
		return data;	
	}
	
	
	
	@DataProvider(name="amazonData") 
	public Object[][] passData()
	{
		//String Excelpath="D:\\Eclipse\\New folder\\POM\\src\\TestData\\InputData.xlsx";
		ExcelDataConfig config=new ExcelDataConfig(Excelpath);
	
		int rows=config.getRowCount(0);
		Object[][] data  =new Object[rows][2];
		
		for(int i=0; i <rows; i++)
		{
			data[i][0]=config.getData(0, i, 0);
			data[i][1]=config.getData(0, i, 1);
		}
		return data;	
	}
	
	
	

}
