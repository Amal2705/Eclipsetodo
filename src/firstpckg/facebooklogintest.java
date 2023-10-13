package firstpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogintest 
{

	public static void main(String[] args)
	{
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.findElement(By.id("email")).sendKeys("amal@gmail.com");
	  driver.findElement(By.name("pass")).sendKeys("amal");
	  driver.findElement(By.name("login")).click();
	  
	}

}
