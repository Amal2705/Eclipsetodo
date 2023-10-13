package Testngpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class taskenabledisable 
{
	ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void browser()
{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}

@Test(priority=1)
public void todoradiobuttonchek()
{
	WebElement radiobuttoncheck=driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[24]/td[3]/input[1]"));
	if(radiobuttoncheck.isSelected())
	{
		System.out.println("selected");
	}
	else
	{
	System.out.println("notselected");	
	}
	
}
@Test(priority=2)
public void buttonenabled()
{
	WebElement enablebutton =driver.findElement(By.id("Register"));
	if(enablebutton.isEnabled())
	{
		System.out.println("is enabled");
		
	}
	else
	{
		System.out.println("not enabled");
	}
}









}
