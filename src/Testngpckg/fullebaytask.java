package Testngpckg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fullebaytask 
{
 ChromeDriver driver;
 @BeforeTest
 public void setup()
 {
	 driver=new ChromeDriver();
 }
 @BeforeMethod
 public void browserurl()
 {
	 driver.get("https://www.ebay.com/");
 }
 
 @Test
 public void linkcountebay()
 {
		List< WebElement>ebaylinkcount=driver.findElements(By.tagName("a"));
		System.out.println("link count = "+ebaylinkcount.size());
 }
 
 @Test
 public void searchbutton()
 {
	WebElement searchbuttonkey=  driver.findElement(By.xpath("//input[@value='Search']"));
	if(searchbuttonkey.isEnabled())
	{
		System.out.println("search button is enabled");
	}
	else
	{
		System.out.println("searchbutton is not enabled");
	}
 }
 @Test
 public void logo()
 {
	  WebElement logokey= driver.findElement(By.xpath("//img[@id='gh-logo']")) ;
	  
	  if(logokey.isDisplayed())
	  {
		  System.out.println("logo is displayed");
	  }
	  else
	  {
		  System.out.println("lgo is not displayed");
	  }
 }
 @Test
 public void dailydealstext()
 {
	String fullcode= driver.getPageSource();
	String neededtext="Daily Deals";
	if(fullcode.contains(neededtext))
	{
		System.out.println("Daily deals text is present");
	}
	else
	{
		System.out.println("text is not present");
	}
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 

 
}
