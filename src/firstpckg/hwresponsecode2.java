package firstpckg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hwresponsecode2
{
 ChromeDriver driver;
 @Before
 public void setup() 
 {
	 driver= new ChromeDriver();
 }

 
 @Test
 public void todoresponseebay()
 {
	driver.get("https://www.ebay.com/"); 
	List<WebElement> ebaylinktype = driver.findElements(By.tagName("a"));
	System.out.println(ebaylinktype.size());
	
		for(WebElement eachebaylinks:ebaylinktype)
		{
		String ebaygetlinks=eachebaylinks.getAttribute("href");
		verify(ebaygetlinks);
		}
					
}
  

  public void verify(String ebaygetlinks) 
{
	  try 
	  {
		  URL ob=new URL(ebaygetlinks);
		 HttpURLConnection con=(HttpURLConnection) ob.openConnection();
		 con.connect();
		 if(con.getResponseCode()==200)
		 {
			 System.out.println(ebaygetlinks+"-----successfulllink");
			 
		 }
		  else if(con.getResponseCode()==404)
		 {
			 System.out.println(ebaygetlinks+"-----brokenlink");
		 }
		  
	  }
	  catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
	
	
}



}	


