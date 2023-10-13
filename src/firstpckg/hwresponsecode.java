package firstpckg;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class hwresponsecode
{
ChromeDriver driver;
String baseurl="https://www.youtube.com/";

@Before
public void setup()
{
	driver=new ChromeDriver();
			
}
@Test
public void todoinmysite() throws Exception
{
	driver.get(baseurl);
	
	URL ob=new URL(baseurl);
	HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	con.connect();
	if(con.getResponseCode()==200)
	{
		System.out.println(baseurl+"---successfull link");
	}
	
	else if(con.getResponseCode()==404)
	{
		System.out.println(baseurl+"----brokenlink");
	}
	
}

}
