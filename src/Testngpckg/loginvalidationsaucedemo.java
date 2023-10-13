package Testngpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginvalidationsaucedemo 
{
ChromeDriver driver;

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
}

@Test
public void todoinsaucedemo()
{
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	
	
	String Expected="https://www.saucedemo.com/inventory.html";
	String Actual=driver.getCurrentUrl();
	
	
	Assert.assertEquals(Actual,Expected);
	System.out.println("Successfully Logged IN");
}
}
