package Testngpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class groupingpgm
{
	ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading() 
{
	driver.get("https://www.google.com/");
}
@Test(groups = "smoke")
public void test1()
{
	System.out.println("test1");;
}
@Test(groups = { "sanity"})
public void test2()
{
	System.out.println("test2");
}
@Test(groups = {"smoke","sanity"})
public void test3() 
{
         
	System.out.println("test3");
}
@Test(groups = { "smoke"})
public void test4() 
{
	System.out.println("test4");
}
@AfterMethod
public void methodclose()
{
	System.out.println("method close");
}
@AfterTest
public void browserclose()
{
	System.out.println("browserclose");
}
}



