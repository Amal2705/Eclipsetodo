package firstpckg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplelinksresponsecode
{
ChromeDriver driver;
@Before
public void setup() 
{
	driver=new ChromeDriver();
}

@Test
public void togetresponsecodemultiplselinks()
{
	driver.get("https://www.mgu.ac.in/");
	List<WebElement> mgulinks=driver.findElements(By.tagName("a"));
	System.out.println(mgulinks.size());
	
	for(WebElement eachmgulinks:mgulinks)
	{
		String alllinks=eachmgulinks.getAttribute("href");
	     verify(alllinks);
		
	}
	
}

public void verify(String alllinks)
{
try
{
	
	URL ob=new URL(alllinks);
  HttpURLConnection con= (HttpURLConnection)ob.openConnection();
  con.connect();
  if(con.getResponseCode()==200)
  {
	  System.out.println("successfull link-----"+alllinks);
  }
  else if(con.getResponseCode()==404)
  {
	  System.out.println("broken link-----"+alllinks);
  }
  
}
catch(Exception e) 
{
	e.getMessage();
}
	
}
}

























