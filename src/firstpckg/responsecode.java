package firstpckg;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class responsecode 
{
 ChromeDriver driver;
 String baseurl="https://www.google.com/";
 @Before
 public void setup()
 {
	 driver=new ChromeDriver();
	 
 }
 @Test
 public void togetresponsecode() throws Exception
 {
	 driver.get(baseurl);
	 URL ob=new URL(baseurl);
	 
	 HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	    con.connect();
	    if(con.getResponseCode()==200)
	    {
	    	System.out.println(baseurl+"---- successfull");
	    	
	    }
	    else
	    {
	    	System.out.println("not 200");
	    }
	 
 }
 
}
