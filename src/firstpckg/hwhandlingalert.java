package firstpckg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class hwhandlingalert
{
ChromeDriver driver;

@Before
public void setup()
{
	driver =new ChromeDriver();
	
}

@Test
public void todohandlingalert()

{
	driver.get("file:///C:/Users/ahi78/OneDrive/Desktop/firstsite.html");
	driver.findElement(By.xpath("//*[contains(@onclick,'display_alert()')]")).click();
	Alert handlealert=driver.switchTo().alert();
	System.out.println(handlealert.getText());
	String alerttext=handlealert.getText();
	String orginal="Hello! I am an alert box!!";
	if(orginal.equals(alerttext))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	handlealert.accept();
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("amal");
	driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("sasi");
	driver.findElement(By.xpath("/html/body/input[4]")).click();
}
}
