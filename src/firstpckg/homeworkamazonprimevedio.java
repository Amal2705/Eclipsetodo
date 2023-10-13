package firstpckg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeworkamazonprimevedio 
{
ChromeDriver driver;
@Before
public void setup()
{
	driver =new ChromeDriver();
}
@Test
public void todoinamazonprimevedio()
{
	driver.get("https://www.primevideo.com/");
	List<WebElement>amazonprimelinks=driver.findElements(By.tagName("a"));
	System.out.println("total links= "+amazonprimelinks.size());
	for(WebElement eachprimelinks:amazonprimelinks)
	{
		String linkaddress=eachprimelinks.getAttribute("href");
		String linktext=eachprimelinks.getText();
		System.out.println(linktext+"------"+linkaddress);
	}
}

}
