package Testngpckg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hwdatepick
{
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@Test
public void todobookingcom() throws InterruptedException
{
	driver.get("https://www.booking.com/");
	driver.navigate().refresh();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div/button[1]")).click();
	
	while(true)
	{
		WebElement Actualmonth=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3"));
		System.out.println(Actualmonth);
		if(Actualmonth.equals("october 2023"))
		{
			System.out.println("the month is");
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button")).click();
			break;
		}
	}
		
		List<WebElement>alldates=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span"));
		for(WebElement dateelement:alldates)
		{
	      String currentdate=dateelement.getText();
	      System.out.println(currentdate);
	      String requireddate="20";
	      if(currentdate.equals(requireddate))
	      {
	    	  dateelement.click();
	    	  break;
	      }
		}
		
	}
	
}

