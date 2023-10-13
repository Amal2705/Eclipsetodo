package Testngpckg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class righclickdoubleclicktask
{
ChromeDriver driver;
@BeforeTest
public void setup() 
{
	driver=new ChromeDriver();
	
}

@Test
public void todoinguru99()
{
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement righclick=driver.findElement(By.xpath("//*[contains(text(),'right click me')]"));
	Actions ob=new Actions(driver);
	ob.contextClick(righclick);
  ob.perform();
  driver.findElement(By.xpath("//*[@id='authentication']/ul/li[1]")).click();
  Alert alerthandle=driver.switchTo().alert();
  alerthandle.accept();
 WebElement doubleclick= driver.findElement(By.xpath("//*[contains(text(),'Double-Click Me To See Alert')]"));   
 ob.doubleClick(doubleclick);
 ob.perform();
 Alert alerthandle2=driver.switchTo().alert();

 System.out.println( alerthandle2.getText());
 alerthandle2.accept();
 
}
}