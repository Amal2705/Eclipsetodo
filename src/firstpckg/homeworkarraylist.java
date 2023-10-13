package firstpckg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeworkarraylist
{
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
}
@Test
public void todoinmguniv()
{
	driver.get("https://www.mgu.ac.in/");
	List<WebElement>mglinks=driver.findElements(By.tagName("a"));
	System.out.println("no:of links in MGU= "+mglinks.size());
	
	for(WebElement mgeachlink:mglinks)
	{
		String getmglink=mgeachlink.getAttribute("href");
		String getmglinktext=mgeachlink.getText();
		System.out.println(getmglinktext+"----------"+getmglink);
	}
}
}
