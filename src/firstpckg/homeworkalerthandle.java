package firstpckg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeworkalerthandle
{
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
}

@Test
public void todohw()
{
	driver.get("file:///C:/Users/ahi78/OneDrive/Desktop/firstsite.html");
	driver.findElement(By.xpath("//*[contains(@onclick,'display_alert()')]")).click();
	Alert a=driver.switchTo().alert();
	String alerttext=a.getText();
	String alertorginaltext="Hello! i am an alert box!!";
	if(alertorginaltext.equalsIgnoreCase(alerttext))
		{
		System.out.println("pass");
		}
	else
	{
		System.out.println("fail");
	}
	System.out.println(alerttext);
	a.accept();
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("amal");
	driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("sasi");
	driver.findElement(By.xpath("/html/body/input[4]")).click();
	
	
}
}
