package com.unisys.pom.util;

import java.util.Hashtable;

public class Constants {
	public static final boolean GRID_RUN = true;
	
	//Environment
	public static final String ENV="PROD"; //PROD, UAT,SAT 
	
	// URLs-prod
	public static final String PROD_HOMEPAGE_URL = "http://ustr-erl-7965.na.uis.unisys.com:8080/selling-point-service/#/";
	public static final String PROD_USERNAME = "admin";
	public static final String PROD_PASSWORD = "admin";

	// URLs-uat
	public static final String UAT_HOMEPAGE_URL = "http://uat.test.com";
	public static final String UAT_USERNAME = "uat.test";
	public static final String UAT_PASSWORD = "uat_test";
	
	public static Hashtable<String,String> table;
	public static Hashtable<String,String> getEnvDetails(){
		if(table==null){
			table = new Hashtable<String,String>();
			if(ENV.equals("PROD")){
				table.put("url", PROD_HOMEPAGE_URL);
				table.put("username", PROD_USERNAME);
				table.put("password", PROD_PASSWORD);
			}else if(ENV.equals("UAT")){
				table.put("url", UAT_HOMEPAGE_URL);
				table.put("username", UAT_USERNAME);
				table.put("password", UAT_PASSWORD);
			}
		}
		return table;
	}

	//Paths
	public static final String CHROME_DRIVER_EXE=System.getProperty("user.dir")+"/drivers/chromedriver.exe";
	public static final String CHROME_DRIVER_EXE_Linux = System.getProperty("user.dir")+"/drivers/chromedriver";
	public static final String FIREFOX_DRIVER_EXE=System.getProperty("user.dir")+"/drivers/geckodriver.exe";
	public static final String FIREFOX_DRIVER_EXE_Linux = System.getProperty("user.dir")+"/drivers/geckodriver";
	public static final String REPORTS_PATH = System.getProperty("user.dir")+"/Report/";
	public static final String DATA_XLS_PATH = System.getProperty("user.dir")+"/data/Data.xlsx";
	public static final String TESTDATA_SHEET = "TestData";
	public static final String TESTCASES_SHEET = "TestCases";
	public static final String RUNMODE_COL = "Runmode";

	//Locators_LoginPage
	public static final String LOGIN_USERNAME = "//*[@id='login_username']";
	public static final String LOGIN_PASSWORD = "//*[@id='password']";
	public static final String LAUNCHPAGE_LINK = "//*[@id='sell-taba']";
	public static final String LOGIN_BUTTON = "//*[@id='login_btn']";

	////Locators_SellPage
	public static final String SELL_SELLTAB = "//*[@id='sell-taba']";
	public static final String SELL_PRODUCTNAME = "//*[@ng-model='productData.name']";
	public static final String SELL_DESCRIPTION = "//*[@ng-model='productData.description']";
	public static final String SELL_PRICE = "//*[@ng-model='productData.price']";
	public static final String SELL_SELECTCATEGORY = "//*[@ng-model='productData.category']";
	public static final String SELL_CATEGORY = "//*[@label='Books']";
	public static final String SELLPAGE_SUCCESSMESSAGE = "//*[@ng-if='successStatus']";
	public static final String SELL_PUBLISHBUTTON = "//*[@id='submit']";

	
}
