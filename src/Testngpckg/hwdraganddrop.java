package Testngpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hwdraganddrop 
{
 ChromeDriver driver;
 @BeforeTest
 public void setup() 
 {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
 }
 @Test
 public void tododraganddrop() 
 {
	 driver.get("https://demo.guru99.com/test/drag_drop.html");
	 Actions ob=new Actions(driver);
	 WebElement bankname=driver.findElement(By.xpath("//*[@id=\"credit2\"]"));
	 WebElement banknamelocation=driver.findElement(By.xpath("//*[@id=\"bank\"]"));
	 ob.dragAndDrop(bankname, banknamelocation);
	 ob.perform();
	 
	 WebElement bankamount=driver.findElement(By.xpath("//*[@id=\"fourth\"]"));
	 WebElement bankamountlocation=driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
	 ob.dragAndDrop(bankamount, bankamountlocation);
	 ob.perform();
	 
	 
	 
	 
	 
	 
	 
	 WebElement salesname=driver.findElement(By.xpath("//*[@id=\"credit1\"]"));
	 WebElement salesnamelocation=driver.findElement(By.xpath("//*[@id=\"loan\"]"));
	 ob.dragAndDrop(salesname, salesnamelocation);
	 ob.perform();
	 
	 WebElement salesamount=driver.findElement(By.xpath("//*[@id=\"fourth\"]"));
	 WebElement salesamountlocation=driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
	 ob.dragAndDrop(salesamount, salesamountlocation);
	 ob.perform();
	 
	WebElement perfecttext= driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
	
	if(perfecttext.isDisplayed())
	{
		System.out.println("'Perfect'text is displayed");
	}
	else
	{
		System.out.println("'Perfect'text is not displayed");
	}
	 
	 
 }
}
