package firstpckg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon1 
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
   
	@Test
	public void todoinamazon() 
	{
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='nav-cart-count-container']/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[6]")).click();
		driver.findElement(By.xpath("//*[@class='_p13n-zg-nav-tree-all_style_zg-browse-group__88fbz']/div[2]/a")).click();
	}
	
	
}
