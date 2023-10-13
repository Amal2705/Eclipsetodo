package ProjectTEst;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class taskaction 
{
WebDriver driver;

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
}

@Test
public void todotaskaction() throws IOException, InterruptedException
{
	task ob=new task(driver);
	ob.tododatadriveninsauce();
	ob.todoclick();
	ob.userinformation("Amal","Sasi", "690505");
	ob.userinformationclick();
}
}
