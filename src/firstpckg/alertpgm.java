package firstpckg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpgm
{
ChromeDriver driver;

@Before
public void setup()
{
	driver=new ChromeDriver();
	
}
@Test
public void todoinfirstsite()
{
	driver.get("file:///C:/Users/ahi78/OneDrive/Desktop/firstsite.html");
	driver.findElement(By.xpath("//*[contains(@onclick,'display_alert()')]")).click();
	Alert alerthandle=driver.switchTo().alert();
	String alerttext=alerthandle.getText();
	String alertorginaltext="Hello! I am an alert box!!";
	if(alertorginaltext.equals(alerttext))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	System.out.println(alerttext);
	alerthandle.accept();
	driver.findElement(By.name("fistname")).sendKeys("amal");
	driver.findElement(By.name("lastname")).sendKeys("sasi");
	driver.findElement(By.xpath("//*[contains(@value,'Submit')]")).click();
	
}

}
