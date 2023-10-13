package ProjectTEst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fbcreatepageaction
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	
	@Test
	public void todofbcreatepageaction()
	{
		fbcreatepage ob=new fbcreatepage(driver);
		ob.toclick();
		
	}
}
