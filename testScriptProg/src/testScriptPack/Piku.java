package testScriptPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class Piku {
	public WebDriver driver;
 
	  @Test
	  public void main() {
		driver.findElement(By.id("email")).sendKeys("priyanka.itengineer@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Jiya@1234567890");	
	driver.findElement(By.id("u_0_8")).click();
  }
	  @BeforeMethod
	  public void launch()
	  {
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	  }
	  @AfterMethod
	  public void close()
	  {
		  driver.close();
	  }
}