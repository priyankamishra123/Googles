package testScriptPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class Piku2 {
	public WebDriver driver=new ChromeDriver();
	 @BeforeMethod
	  public void launch()
	  {
		  
		  try {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			 
			//driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			System.out.println("launch browser");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("exception in launch generated");
		}
	  }
	  @Test
	  public void main()throws InterruptedException {
		
			try {
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				driver.findElement(By.id("email")).sendKeys("priyanka.itengineer@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Jiya@1234567890");	
driver.findElement(By.id("u_0_2")).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//System.out.println("main ---test Script");
			
			 Alert alert = driver.switchTo().alert();
             alert.accept();
             driver.switchTo().alert().dismiss();
		driver.findElement(By.cssSelector("//*[@id=\"bookmarks_jewel\"]")).click();
		driver.findElement(By.cssSelector("//*[@id=\"u_e_1\"]/div/div/div/div[2]/div/div[7]/a")).click();
			}
		catch (WebDriverException we) {
			we.printStackTrace();
		}
	  }
	 
	  @AfterMethod
	  public void close()
	  {
		  System.out.println("aftermethod annotation ----close");
		  driver.close();
	  }
}