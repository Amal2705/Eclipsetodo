package Testngpckg;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hwwindowhandle
{
ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}

@Test
public void todoinudemy()
{
	driver.get("https://www.amazon.in/");
	
	String parentwindow= driver.getWindowHandle();
	
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
	
	Set<String> allwindows=driver.getWindowHandles();
	
	for(String handle:allwindows)
	{
		if(!handle.equalsIgnoreCase(parentwindow))
		{
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();
		}
		
		
	}
	
	
}
}
