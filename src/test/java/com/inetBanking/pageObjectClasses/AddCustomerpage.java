package com.inetBanking.pageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerpage {
	WebDriver driver1;
	
	public AddCustomerpage(WebDriver rdriver) {
		driver1=rdriver;
		PageFactory.initElements(rdriver, this);
	}
 @FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
 @CacheLookup
 WebElement addcustomer;
 @FindBy(name="name")
 WebElement custname;
 @FindBy(xpath="//input[@type='radio']")
 WebElement custgender;
 @FindBy(name="dob")
 WebElement custdob;
 @FindBy(name="addr")
 WebElement custadd;
 @FindBy(name="city")
 WebElement custcity;
 @FindBy(name="state")
 WebElement custstate;
 @FindBy(name="pinno")
 WebElement custpin;
 @FindBy(name="telephoneno")
 WebElement custphone;
 @FindBy(name="emailid")
 WebElement custemail;
 @FindBy(name="sub")
 WebElement submit;
 
 
 public void clickaddcustomer() {
	 addcustomer.click();
	 
 }
 public void setname(String uname) {
	 custname.sendKeys(uname);
 }
 public void setgender(String cgender) {
	 custgender.sendKeys(cgender);
 }
 public void setdob(String mm,String dd,String yyyy) {
	 custdob.sendKeys(mm);
	 custdob.sendKeys(dd);
	 custdob.sendKeys(yyyy);
 }
 public void setaddress(String cadd) {
	 custadd.sendKeys(cadd);
 }
 public void setcity(String cucity) {
	 custcity.sendKeys(cucity);
 }
 public void setstate(String cstate) {
	 custstate.sendKeys(cstate);
 }
 public void setpinno(String cpin) {
	 custpin.sendKeys(String.valueOf(cpin));
 }
 public void setphone(String cphone) {
	 custphone.sendKeys(cphone);
 }
 public void setemail(String cemail) {
	 custname.sendKeys(cemail);
 }
 public void clicksubmit() {
	 submit.click();
 }
 
}
