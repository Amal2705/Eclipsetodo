package firstpckg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hwresponsetodo
{
ChromeDriver driver;

@Before
public void setup()
{
	driver=new ChromeDriver();
			
}

@Test
public void todoinsamsung()
{
	driver.get("https://www.samsung.com/");
	List<WebElement> samsunglinktype=driver.findElements(By.tagName("a"));
	System.out.println(samsunglinktype.size());
	
	for(WebElement samsungalllinks:samsunglinktype)
	{
		String samsungfull=samsungalllinks.getAttribute("href");
		verify(samsungfull);
		
	}
}

 public void verify(String samsungfull) 
 {
		try 
		{
			
			URL ob=new URL(samsungfull);
			HttpURLConnection con=(HttpURLConnection)ob.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println(samsungfull+"-----successfulllink");
			}
			else if (con.getResponseCode()==404)
			{
				System.out.println(samsungfull+"-----brokenlink");
			}
			
			
		}
		catch(Exception e)
		{
			e.getMessage();
		}
 }
}
