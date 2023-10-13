package firstpckg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jniteg
{
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();		
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void test1()
	{
	
		driver.findElement(By.name("q")).sendKeys("Messi",Keys.ENTER);
		
	}
   @Test
   public void titleverification()
   {
     String actual= driver.getTitle();
    String expected="google";
    
    if(actual.equalsIgnoreCase(expected))
    	
    {
    	System.out.println("pass");
    	
    }
    else
    {
    	System.out.println("fail");
    }
    
   }
   
   @Test
   public void contentverification()
   {
	   String a=driver.getPageSource();
	   String b="Gail";
	   if(a.contains(b))
	   {
		   System.out.println("pass");
	   }
	   else
	   {
		   System.out.println("fail");
	   }
   }
   
   @After
   public void toend()
   {
	   
	   driver.quit();
	   
   }
 
   
   
}

