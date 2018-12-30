package com.unisys.pom.testcases;

import java.util.Hashtable;

import java.util.*;


import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.LogStatus;
import com.unisys.pom.pages.LaunchPage;
import com.unisys.pom.pages.LoginPage;
import com.unisys.pom.pages.session.LandingPage;
import com.unisys.pom.testcases.base.BaseTest;
import com.unisys.pom.util.Constants;
import com.unisys.pom.util.DataUtil;
import com.unisys.pom.util.*;

public class LoginTest extends BaseTest {
	String testCaseName="LoginTest";
	String testCaseName1="LoginTest";
<<<<<<< HEAD
	String testCaseName100="LoginTest";
=======
	String testCaseName2="LoginTest";
>>>>>>> ce4d7896b304b3ead84383289a56033f8cfed7cc

	@Test(dataProvider="getData")
	public void doLogin(Hashtable<String, String> data)
	{
		test=extent.startTest(testCaseName,"Login Functionality validation");
		if(!DataUtil.isTestExecutable(xls, testCaseName) ||  data.get(Constants.RUNMODE_COL).equals("N")){
			test.log(LogStatus.SKIP, "Skipping the test as Rnumode is N");
			throw new SkipException("Skipping the test as Rnumode is N");
		}

		test.log(LogStatus.INFO,"Starting Login Test");
		init(data.get("Browser"));

		LaunchPage launchpage=new LaunchPage(driver,test);
		PageFactory.initElements(driver, launchpage);

		LoginPage loginPage=launchpage.gotoLoginPage();
		Object page=loginPage.doLogin(data.get("Username"), data.get("Password"));
		
		String actualResult="";		
		if(page instanceof LandingPage)
			actualResult="Success";
		else
			actualResult="Unsuccessful";
		if(!actualResult.equals(data.get("ExpectedResult"))){
			reportFailure("User NOT Logged in");
		}
		test.log(LogStatus.PASS, "Login Test Passed");
	}


	@AfterMethod
	public void quit()
	{
		if(extent!=null)
		{
			extent.endTest(test);
			extent.flush();		
		}
		if(driver!=null)
		{
			driver.quit();
		}
	}

	@DataProvider
	public Object[][] getData()
	{
		return DataUtil.getData(xls, testCaseName);
	}
}
