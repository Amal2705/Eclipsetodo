package Testngpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class draganddropbank 
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
		WebElement bankamount=driver.findElement(By.xpath("//*[@id=\"fourth\"]"));
		WebElement bankamountsection=driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		ob.dragAndDrop(bankamount, bankamountsection);
		ob.perform();
		WebElement bankname=driver.findElement(By.xpath("//*[@id=\"credit2\"]"));
		WebElement  banknamesection=driver.findElement(By.xpath("//*[@id=\"bank\"]"));
		ob.dragAndDrop(bankname, banknamesection);
		ob.perform();
		
		
		
	    WebElement  salesname=driver.findElement(By.xpath("//*[@id=\"credit1\"]"));
	    WebElement  salesnamesection=driver.findElement(By.xpath("//*[@id=\"loan\"]"));
	    ob.dragAndDrop(salesname, salesnamesection);
	    ob.perform();
	    WebElement  salesamount=driver.findElement(By.xpath("//*[@id=\"fourth\"]"));
	    WebElement  salesamountsection=driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
	    ob.dragAndDrop(salesamount, salesamountsection);
	    ob.perform();
	    
        WebElement perfectbutton=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
        if(perfectbutton.isDisplayed())
        {
        	System.out.println("Perfect button is displayed");
        }
        else
        {
        	System.out.println("perfect button is not displayed");
        }
	    
		
	  
		
		
	}
}

