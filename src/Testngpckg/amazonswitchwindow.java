package Testngpckg;

import java.time.Duration;
import java.util.Set;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazonswitchwindow 
{
 ChromeDriver driver;
 @BeforeTest
 public void setup()
 {
	 driver=new ChromeDriver();
 }
 
 @Test
 public void todoswitchwindowinamazon() throws InterruptedException
 {
	 driver.get("https://www.amazon.in/");
	 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
	String parentwindow= driver.getWindowHandle();
	 
	 
	 driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
	Set<String>allwindows= driver.getWindowHandles();
	
	for(String handle:allwindows)
	{
		if(!handle.equalsIgnoreCase(parentwindow))
		{
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
		}
		
		
	}
	
	 
 }
}

