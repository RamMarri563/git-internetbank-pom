package com.inetBanking.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetBanking.pageObjectClasses.AddCustomerpage;
import com.inetBanking.pageObjectClasses.LoginPage;

import junit.framework.Assert;

public class TC_AddCustomer_002 extends BaseClass {
	
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		
		Thread.sleep(3000);
		AddCustomerpage  addcusto=new AddCustomerpage(driver);
		addcusto.clickaddcustomer();
		addcusto.setname("ram");
		addcusto.setgender("male");
		addcusto.setdob("05", "11", "1999");
		Thread.sleep(3000);
		
		addcusto.setaddress("India");
		addcusto.setcity("Hyd");
		addcusto.setstate("TS");
		addcusto.setpinno("500081");
		addcusto.setphone("8074266590");
		addcusto.setemail("rama123@gmail.com");
		addcusto.clicksubmit();
		Thread.sleep(3000);
		boolean res=driver.getPageSource().contains("Customer Registered Successfully");
		if(res==true) {
			Assert.assertTrue(true);
		}
		else {
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
		
		
	}

}
