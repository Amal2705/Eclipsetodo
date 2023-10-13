package firstpckg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1
{
ChromeDriver driver;

@Before
public void setup()
{
	driver=new ChromeDriver();
}

@Test
public void todoinrediffmail()
{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	WebElement logocheck=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img"));
	if(logocheck.isDisplayed())
	{
		System.out.println("logo is displayed");
		
	}
	else 
	{
		System.out.println("logo is not displayed");
	}
	
}
}
