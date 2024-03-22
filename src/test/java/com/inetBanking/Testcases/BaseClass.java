package com.inetBanking.Testcases;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.utils.FileUtil;
import com.inetBanking.Utilities.ReadConfig;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BaseClass {
	ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getApplicationUrl();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	//public static Logger logger;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		 //logger=Logger.getLogger(BaseClass.class);
			//PropertyConfigurator.configure("log4j2.xml");
			if(br.equals("msedge")) {
		System.setProperty("webdriver.msedge.driver",readconfig.getmsedge());
		driver=new EdgeDriver();
			}
			else if (br.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver",readconfig.getFirepath());
				driver=new FirefoxDriver();
				
			}
			else if (br.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
				driver=new ChromeDriver();
				
			}
			
		
	}
	@AfterClass
	public void exit() {
		driver.quit();
	}
	public void captureScreen(WebDriver driver, String sname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/" + sname + ".png");
		FileUtils.copyFile(src, target);
		System.out.println("Screenshot taken");
		
	}

}
