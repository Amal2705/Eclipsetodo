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

public class totakescreenshot 
{
 ChromeDriver driver;
 @Before
 public void setup()
 {
	 driver=new ChromeDriver();
 }
 
	 @Test
	 public void togetscreenshot() throws IOException
	 {
		 driver.get("https://www.facebook.com/");
		        File facebookpage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		        FileHandler.copy(facebookpage, new File("D://screenshot.png"));
		        
		        WebElement loginbutton=driver.findElement(By.name("login"));
		         File loginelement= loginbutton.getScreenshotAs(OutputType.FILE);
		         FileHandler.copy(loginelement, new File("./facebooks/loginbutton2.png"));
	 }
 }

