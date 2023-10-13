package firstpckg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework3 
{
	ChromeDriver driver;

	@Before
	public void setup()
	{
		 driver=new ChromeDriver();
         driver.get("https://www.google.com/");	
         
	}
	
	@Test
	public void titleverification()
	{
		String a=driver.getTitle();
		String b="Google";
		if(a.equals(b))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
		@Test
		public void webapp()
		
		{
			driver.findElement(By.name("q")).sendKeys("amazon",Keys.ENTER);
			
			
			
		}
	
		@After
		public void ending()
		{
			
			driver.quit();
		}
		}

