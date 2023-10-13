package Testngpckg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hwrightclickdoubleclick
{
 ChromeDriver driver;

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@Test
public void hwguru99rightdouble()
{
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	 WebElement rightclick=driver.findElement(By.xpath("//*[contains(text(),'right click me')]"));
	 Actions ob=new Actions(driver);
	 ob.contextClick(rightclick);
	 ob.perform();
	 driver.findElement(By.xpath("//*[@id='authentication']/ul/li[1]")).click();
	 Alert editalert=driver.switchTo().alert();
	 editalert.accept();
	 
	WebElement doubleclick= driver.findElement(By.xpath("//*[contains(text(),'Double-Click Me To See Alert')]"));
	ob.doubleClick(doubleclick) ;
	ob.perform();
	Alert doubleclickalert=driver.switchTo().alert();
	System.out.println("double click alert text = "+doubleclickalert.getText());
	doubleclickalert.accept();
	
}


}