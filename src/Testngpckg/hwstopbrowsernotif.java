package Testngpckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hwstopbrowsernotif
{
WebDriver driver;

@BeforeTest
public void setup()
{
	
	ChromeOptions ob=new ChromeOptions();
	ob.addArguments("--disable-notifications");
	driver=new ChromeDriver(ob);
	
}

@Test
public void todoinJD()
{
	driver.get("https://www.justdial.com/");
}
}
