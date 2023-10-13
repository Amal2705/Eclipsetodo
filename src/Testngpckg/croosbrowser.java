package Testngpckg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class croosbrowser
{
WebDriver driver;

@Parameters({"browser"})
@BeforeTest
public void setup(String browserkey)
{
	if(browserkey.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
				
	}
	else if(browserkey.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
	}
	
}
@Test
public void todoinfb()
{
	driver.get("https://www.facebook.com/");

}


}
