package com.amazon.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.Pages.HomePage;
import com.amazon.Pages.LoginPage;

import Utility.BrowserFactory;
//import lib.ExcelDataConfig;
import lib.ExcelDataConfig2;

public class VerifyAmazonLoginExcelData2 {
	
	WebDriver driver;
	String Excelpath="D:\\Eclipse\\New folder\\POM2\\src\\TestData\\InputData.xlsx";
	
	ExcelDataConfig2 excel=new ExcelDataConfig2(Excelpath);
	
	@BeforeMethod
	public void setUp(){
	System.out.println("Before Method !!");
	
	String sUrl="https://www.amazon.co.uk/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=gbflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3Fref_%3Dnav_signin&switch_account=";
	
	// This will launch specific browser
			driver=BrowserFactory.startBrowser("Chrome", sUrl);
			//driver=BrowserFactory.startBrowser("Firfox", sUrl);
					
			/*
			System.setProperty("webdriver.chrome.driver", "G:/selenium/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(sUrl);
				*/
	}

		
	@Test
	public void TC0002() throws InterruptedException{

		// Page Init
		LoginPage login = new LoginPage(driver);  
		HomePage homepg = new HomePage(driver);
		
		// Data Assignment from Excel
		String TC="TC0002";
		String uuser = excel.readXL(TC, "Login");
		String ppass = excel.readXL(TC, "Password");
		String SrchWord =excel.readXL(TC, "SearchWord");
		
		// Actions
		login.loginToAmazon(uuser, ppass);
		homepg.searchAmazon(SrchWord);
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	

}
