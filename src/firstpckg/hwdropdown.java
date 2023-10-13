package firstpckg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hwdropdown 
{
ChromeDriver driver;
@Before
public void setup()
{
	driver =new ChromeDriver();
}
	@Test
	public void todoinrediff() throws InterruptedException
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	WebElement dobday=	driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
	Select dobdaydropdown=new Select(dobday);
	dobdaydropdown.selectByIndex(05);
	WebElement dobmonth=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
	Select dobmonthdropdown=new Select(dobmonth);
	dobmonthdropdown.selectByVisibleText("NOV");
	Thread.sleep(8000);
	WebElement dobyear=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		Select dobyeardropdown=new Select(dobyear);
		dobyeardropdown.selectByValue("2002");
	}

}
