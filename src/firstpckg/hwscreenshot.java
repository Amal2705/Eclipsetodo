package firstpckg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class hwscreenshot
{
ChromeDriver driver;
@Before
public void setup() 
{
	driver=new ChromeDriver();
}
	@Test
	public void todoinudemy() throws IOException
	{
		driver.get("https://www.udemy.com/");
	File udemypage=   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(udemypage,new File("D:\\screenshots\\udemay.png"));
		
		WebElement udemysearch=driver.findElement(By.xpath("//*[@name='q']"));
		File searchss=udemysearch.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(searchss, new File("./screenshotudemy/searhudemy.png"));
	}
}

