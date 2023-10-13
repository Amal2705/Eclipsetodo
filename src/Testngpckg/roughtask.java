package Testngpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class roughtask
{
 WebDriver driver;
 @BeforeTest
 public void setup()
 {
	 driver=new ChromeDriver();
	 driver.get("https://www.saucedemo.com/");
 }
 @Test
 public void todoinsaucecom()
 {
	 driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	 driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	 
	 driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
 }
}
