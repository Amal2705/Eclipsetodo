package Testngpckg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class taslkmousehoverebayimplicitly
{
ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
}
@Test
public void todomousehover()
{
	driver.get("https://www.ebay.com/");
	
	Actions ob=new Actions(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement electronics=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	ob.moveToElement(electronics);
	ob.perform();
	driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
	
}

}