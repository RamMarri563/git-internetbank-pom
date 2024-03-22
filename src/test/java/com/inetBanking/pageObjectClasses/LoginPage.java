package com.inetBanking.pageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
	}
	@FindBy(name="uid")
	WebElement txtUserName;
	@FindBy(xpath="//input[@type='password']")
	WebElement txtPassword;
	@FindBy(name="btnLogin")
	WebElement btLogin;
	
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
		
		
}
	public void setPassword(String upass) {
		txtPassword.sendKeys(upass);
		
		
	}
	public void clickLogin() {
		btLogin.click();
		
		
	}


}
