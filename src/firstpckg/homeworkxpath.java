package firstpckg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeworkxpath
{
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	
}

@Test
public void todoinfifa() throws InterruptedException
{
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("fifa",Keys.ENTER);
	driver.findElement(By.xpath("//*[@class='yuRUbf']/div[1]/span[1]/a[1]/h3[1]")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//*[@id='mainLinksID']/nav/div[1]/div[1]")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//*[@id='subLinkItems2nJ47osyEGsDUMwDYJNKNy']/div[4]/a")).click();
	driver.findElement(By.xpath("//*[@id='mainLinksID']/nav/div[3]/a")).click();
   // driver.findElement(By.xpath("//*[@class='cities-grid_cityCard__1m53j cities-grid_TOR__3GWUO cities-grid_en__1a8jC']/a")).click();
	
	
}
}
