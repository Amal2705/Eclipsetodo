package Testngpckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class hwcrossbrowser 
{
 WebDriver driver;
 @Parameters({"browser"})
 @BeforeTest
 public void setup(String browserkey) 
 {
	 if(browserkey.equalsIgnoreCase("chrometest"))
	 {
		 driver=new ChromeDriver();
		 
	 }
	 
	 else if(browserkey.equalsIgnoreCase("edgetest"))
	 {
		 driver=new EdgeDriver();
	 }
 }
 
 @Test
 public void todoinebay()
 {
	 driver.get("https://www.ebay.com/");
 }
 
}
