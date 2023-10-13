package Testngpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class hwloginvalidation 
{
WebDriver driver;

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
}

public void todologinvalidation()
{
	driver.get("https://www.instagram.com/accounts/login/");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("am.a.__l");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("Amal21@sasi");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).click();
	String Expected="https://www.instagram.com/";
	String Actual=driver.getCurrentUrl();
	Assert.assertEquals(Actual,Expected );
	System.out.println("Succefully Logge IN");
}
}
