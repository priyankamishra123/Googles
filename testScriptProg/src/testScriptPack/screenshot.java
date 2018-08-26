package testScriptPack;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;
//import org.apache.tools.ant.util.FileUtils;
public class screenshot {
@Test
public void guru99Screenshot () throws Exception
{
	WebDriver driver=new ChromeDriver();

System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
driver .manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.manage().window().maximize();

driver.get("https://www.guru99.com/");
TakesScreenshot ts=(TakesScreenshot)driver;
File source=ts.getScreenshotAs(OutputType.FILE);
Files.copy(source, new File("./screenshot/guru.png"));
System.out.println("screenshot taken");
driver.quit();
}
}
