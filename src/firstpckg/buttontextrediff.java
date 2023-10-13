package firstpckg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttontextrediff
{
	ChromeDriver driver;
	
	@Before
	public void setup ()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void buttontext()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement buttontext=driver.findElement(By.xpath("//*[contains(@value,'Check availability')]"));
		String Orginal=buttontext.getAttribute("value");
		String expected="check availability";
		if(expected.equalsIgnoreCase(Orginal))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
		
	}

}
