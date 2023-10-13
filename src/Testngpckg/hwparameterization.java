package Testngpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class hwparameterization 
{
 ChromeDriver driver;
 @BeforeTest
 public void setup() 
 {
	 driver=new ChromeDriver();
	 
 }
 @BeforeMethod
 public void browser()
 {
	 driver.get("https://www.facebook.com/");
 }
@Parameters({"username","password"})
 @Test
 public void todoininstagram(String usernamekey,String passwordkey)
 {
	 driver.findElement(By.id("email")).sendKeys(usernamekey);
	 driver.findElement(By.id("pass")).sendKeys(passwordkey);
	 driver.findElement(By.name("login")).click();
 }
}
