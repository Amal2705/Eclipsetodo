package firstpckg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handledropdown 
{
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	
}
@Test
public void dropdown()
{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
  WebElement dayelement=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
  Select daydropdown=new Select(dayelement);
  daydropdown.selectByIndex(05);
 WebElement monthelement=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
 Select monthdropdown=new Select(monthelement);
 monthdropdown.selectByVisibleText("NOV");
 WebElement yearelement=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
 Select yeardropdown=new Select(yearelement);
 yeardropdown.selectByValue("2002");
  
}
}
