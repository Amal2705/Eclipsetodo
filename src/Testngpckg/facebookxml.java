package Testngpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class facebookxml 
{
	ChromeDriver driver;
	
@BeforeTest
public void setup () 
{
	driver=new ChromeDriver();
	
}
@BeforeMethod
public void browser()
{
	driver.get("https://www.facebook.com/");
}
@Parameters({"email","password"})
@Test
public void todoinfb(String emailkey,String passwordkey)
{
	driver.findElement(By.id("email")).sendKeys(emailkey);
	driver.findElement(By.id("pass")).sendKeys(passwordkey);
	driver.findElement(By.name("login")).click();
	
	
}

}
