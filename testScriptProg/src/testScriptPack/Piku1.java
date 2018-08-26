package testScriptPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Piku1{
@Test(priority=2)	
public void testcase0()
{
System.out.println("test case 0");	
}

@Test(priority=0)	
public void testcase1()
{
System.out.println("test case 1");	
}
@Test(priority=1)	
public void testcase2()
{
System.out.println("test case 2");	
}
}