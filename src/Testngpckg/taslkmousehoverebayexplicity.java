package Testngpckg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class taslkmousehoverebayexplicity
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
	WebDriverWait waittime=new WebDriverWait(driver,Duration.ofSeconds(30));
	Actions ob=new Actions(driver);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement electronics=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	ob.moveToElement(electronics);
	ob.perform();
	waittime.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
	driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
	
}

}