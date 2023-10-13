package firstpckg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class arraylistlinkcount
{
 ChromeDriver driver;
 @Before
 public void setup()
 {
	 driver=new ChromeDriver();
 }
 
 @Test
 public void tocountfacebooklinks()
 {
	 driver.get("https://www.facebook.com/");
	 List<WebElement>linksdetails=driver.findElements(By.tagName("a"));
	 System.out.println("total no:of links= "+linksdetails.size());
	 
	 for(WebElement element:linksdetails)
	 {
		 String links=element.getAttribute("href");
		 String linktext=element.getText();
		 System.out.println(linktext+"-------"+links);
	 }
	 
 }
 
 
}
