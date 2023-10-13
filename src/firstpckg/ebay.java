package firstpckg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay
{
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	
}

@Test
public void todoinebay()
{
	driver.get("https://www.ebay.com/");
	driver.findElement(By.xpath("//*[@id='gh-ac-box2']/input[1]")).sendKeys("mobiles",Keys.ENTER);
	driver.findElement(By.xpath("//*[@id='gh-minicart-hover']/div/a[1]")).click();
	driver.findElement(By.xpath("//*[@id='mainContent']/div/div[2]/div/div[2]/div/div[3]/a[2]")).click();
	driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/ul/li[5]/a")).click();
}
	
}