package firstpckg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath
{
  ChromeDriver driver;
  
  @Before
  public void startup()
  {
	  driver=new ChromeDriver();
	  
  }
  @Test
  public void loginprocess()
  {
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("amal123@gmail.com");
	  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
	  driver.findElement(By.xpath("//button[@name='login']")).click();
	  
	  
  }
  
 // @After
  //public void ending()
  //{
	  
	//  driver.quit();
//  }
  
}
