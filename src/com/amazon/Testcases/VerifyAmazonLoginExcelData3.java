package com.amazon.Testcases;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.Pages.HomePage;
import com.amazon.Pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.BrowserFactory;
//import lib.ExcelDataConfig;
import lib.ExcelDataConfig2;


public class VerifyAmazonLoginExcelData3 {
	
	
	// With test EXTENT REPORTS
	WebDriver driver;
	String Excelpath="D:\\Eclipse\\New folder\\POM2\\src\\TestData\\InputData.xlsx";
	ExcelDataConfig2 excel=new ExcelDataConfig2(Excelpath);
	ExtentReports extent = new ExtentReports("extentreport.html");
	boolean lbresult;
	String flag;

	
	@BeforeMethod
	public void setUp(){
	System.out.println("Before Method !!");
	String sUrl="https://www.amazon.co.uk/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=gbflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3Fref_%3Dnav_signin&switch_account=";
		
	// This will launch specific browser
			driver=BrowserFactory.startBrowser("Chrome", sUrl);
			//driver=BrowserFactory.startBrowser("Firfox", sUrl);

	}

	@Test(priority=1)
	public void TC0001() throws InterruptedException{
		String TC="TC0001";
		ExtentTest test = extent.startTest(TC, "Sample description"+TC);

		// Page Init
		LoginPage login = new LoginPage(driver);  
		HomePage homepg = new HomePage(driver);
		
		// Data Assignment from Excel
		String uuser = excel.readXL(TC, "Login");
		String ppass = excel.readXL(TC, "Password");
		String SrchWord =excel.readXL(TC, "SearchWord");
		
		// Actions
		login.loginToAmazon(uuser, ppass);
		flag=homepg.searchAmazon(SrchWord);
		if(flag.contains("AMD")){
			test.log(LogStatus.PASS, "Login success");
			test.log(LogStatus.PASS, "Navigated to the specified URL !!");
		}
		else{
			test.log(LogStatus.FAIL,"Test Failed");
		}
		
		// ending test
		extent.endTest(test);
		
	}
		
	@Test(priority=2)
	public void TC0002() throws InterruptedException{
		String TC="TC0002";
		ExtentTest test = extent.startTest(TC, "Sample description"+TC);

		// Page Init
		LoginPage login = new LoginPage(driver);  
		HomePage homepg = new HomePage(driver);
		
		// Data Assignment from Excel
		String uuser = excel.readXL(TC, "Login");
		String ppass = excel.readXL(TC, "Password");
		String SrchWord =excel.readXL(TC, "SearchWord");
		
		// Actions
		login.loginToAmazon(uuser, ppass);
		flag=homepg.searchAmazon(SrchWord);
		if(flag.contains("AMD")){
			test.log(LogStatus.PASS, "Login success");
			test.log(LogStatus.PASS, "Navigated to the specified URL !!");
		}
		else{
			test.log(LogStatus.FAIL,"Test Failed");
			test.log(LogStatus.SKIP,"Test Skipped");
			test.log(LogStatus.INFO,"Test Info");
		}
		
		// ending test
		extent.endTest(test);
	}
	
	
	@Test(priority=2)
	public void TC0003() throws InterruptedException{
		String TC="TC0003";
		ExtentTest test = extent.startTest(TC, "Sample description"+TC);

		// Page Init
		LoginPage login = new LoginPage(driver);  
		HomePage homepg = new HomePage(driver);
		
		// Data Assignment from Excel
		String uuser = excel.readXL(TC, "Login");
		String ppass = excel.readXL(TC, "Password");
		String SrchWord =excel.readXL(TC, "SearchWord");
		
		// Actions
		login.loginToAmazon(uuser, ppass);
		flag=homepg.searchAmazon(SrchWord);
		if(flag.contains("AMD")){
			test.log(LogStatus.PASS, "Login success");
			test.log(LogStatus.PASS, "Navigated to the specified URL !!");
		}
		else{
			test.log(LogStatus.FAIL,"Test Failed");
			test.log(LogStatus.SKIP,"Test Skipped");
			test.log(LogStatus.INFO,"Test Info");
		}
		
		// ending test
		extent.endTest(test);
	}
	
	
	@Test(priority=2)
	public void TC0004() throws InterruptedException{
		String TC="TC0004";
		ExtentTest test = extent.startTest(TC, "Sample description"+TC);

		// Page Init
		LoginPage login = new LoginPage(driver);  
		HomePage homepg = new HomePage(driver);
		
		// Data Assignment from Excel
		String uuser = excel.readXL(TC, "Login");
		String ppass = excel.readXL(TC, "Password");
		String SrchWord =excel.readXL(TC, "SearchWord");
		
		// Actions
		login.loginToAmazon(uuser, ppass);
		flag=homepg.searchAmazon(SrchWord);
		if(flag.contains("AMD")){
			test.log(LogStatus.PASS, "Login success");
			test.log(LogStatus.PASS, "Navigated to the specified URL !!");
		}
		else{
			test.log(LogStatus.FAIL,"Test Failed");
			test.log(LogStatus.SKIP,"Test Skipped");
			test.log(LogStatus.INFO,"Test Info");
		}
		
		// ending test
		extent.endTest(test);
	}
	
	
	
	@Test(priority=2)
	public void TC0005() throws InterruptedException{
		String TC="TC0005";
		ExtentTest test = extent.startTest(TC, "Sample description"+TC);

		// Page Init
		LoginPage login = new LoginPage(driver);  
		HomePage homepg = new HomePage(driver);
		
		// Data Assignment from Excel
		String uuser = excel.readXL(TC, "Login");
		String ppass = excel.readXL(TC, "Password");
		String SrchWord =excel.readXL(TC, "SearchWord");
		
		// Actions
		login.loginToAmazon(uuser, ppass);
		flag=homepg.searchAmazon(SrchWord);
		if(flag.contains("AMD")){
			test.log(LogStatus.PASS, "Login success");
			test.log(LogStatus.PASS, "Navigated to the specified URL !!");
		}
		else{
			test.log(LogStatus.FAIL,"Test Failed");
			test.log(LogStatus.SKIP,"Test Skipped");
			test.log(LogStatus.INFO,"Test Info");
		}
		
		// ending test
		extent.endTest(test);
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
				// writing everything to document
				extent.flush();
	}


}
