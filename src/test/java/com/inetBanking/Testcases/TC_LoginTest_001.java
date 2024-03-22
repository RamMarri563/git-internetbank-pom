package com.inetBanking.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetBanking.pageObjectClasses.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException {
		
		
	driver.get(baseURL);
	//logger.info("Url is opend");
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	//logger.info("enter username");
	lp.setPassword(password);
	//logger.info("enter password");
	lp.clickLogin();
	if(driver.getCurrentUrl().equals("https://demo.guru99.com/V1/html/Managerhomepage.php")) {
		captureScreen(driver, "LoginTest");
		Assert.assertTrue(true);
		//logger.info("login passed ");
	}
	else {
		captureScreen(driver, "LoginTest");
		Assert.assertFalse(false);
		//logger.info("login failed");
	}
	}

}
