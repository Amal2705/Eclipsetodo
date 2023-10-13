package firstpckg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hwlogolgihomes
{
 ChromeDriver driver;
 @Before
 public void setup() {
	 driver =new ChromeDriver();
 }
 @Test
 public void todologolgihomes() throws InterruptedException
 {
	 driver.get("https://www.lgihomes.com/");
	 Thread.sleep(8000);
	   WebElement logo=driver.findElement(By.xpath("//*[@id='header']/div/div[1]/div/div[1]/a/img"));
	 if(logo.isDisplayed()==true)
	 {
		 System.out.println("logo is displayed");
	 }
	 else
	 {
		 System.out.println("logo is not displayed");
	 }
 }
}
