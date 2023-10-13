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

public class hwyoutubess 
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
		driver.get("https://www.youtube.com/");
		File ssyoutube=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ssyoutube, new File("D:\\screenshots\\youtubess.png"));
		
		WebElement sssearch=driver.findElement(By.xpath("//*[contains(@name,'search_query')]"));
		File youtubesearch=sssearch.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(youtubesearch,new File("youtubess//yousearch.png"));
	}
}
