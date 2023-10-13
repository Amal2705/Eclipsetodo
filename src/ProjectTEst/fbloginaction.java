package ProjectTEst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fbloginaction
{
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}

@Test
public void todofblogin()
{
	fbloginpage ob=new fbloginpage(driver);
	
	ob.setvalues("amal123@gmail.com", "amal123");
	ob.loginclick();
}
}
