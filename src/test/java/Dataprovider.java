import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	WebDriver driver;
	@BeforeTest
	public void open() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@Test(dataProvider ="signupdata")
	public void login(String uname,String upass) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement web1=driver.findElement(By.name("username"));
	web1.clear();
	web1.sendKeys(uname);
	WebElement web2=driver.findElement(By.name("password"));
	web2.clear();
	web2.sendKeys(upass);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
	driver.findElement(By.linkText("Logout")).click();
	
	
	//driver.quit();
		
	}
	
	@DataProvider(name="signupdata")
	public String[][] logdata(){
		String getdata[][]= {
				{"Admin","admin123"},{"Admin","admin123"},{"Adm","admin123"},{"Admin","admin12"},
		};
		return getdata;
	}
	@AfterTest
	public void close()
	{
		driver.quit();
	}

}
