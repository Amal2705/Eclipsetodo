package Testngpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class keyboardevents
{
 ChromeDriver driver;
 @BeforeTest
 public void setup()
 {
	 driver=new ChromeDriver();
	 
 }
 
 @Test
 public void keyboardrediff()
 {
	 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 WebElement fullname=driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[3]/td[3]/input"));
	 WebElement checkavailability=driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[7]/td[3]/input[1]"));
	 fullname.sendKeys("amal sasi");
	 Actions ob=new Actions(driver);
	 ob.keyDown(fullname, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	 ob.keyDown(fullname, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	 ob.keyDown(checkavailability,Keys.CONTROL ).sendKeys("v").keyUp(Keys.CONTROL);
	 ob.perform();
 }

}
