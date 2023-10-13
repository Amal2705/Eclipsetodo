package Testngpckg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstscripttestng
{
@BeforeTest
public void setup()
{
	System.out.println("browseropen");
}
@BeforeMethod
public void urlloading() 
{
	System.out.println("url details");
}
@Test(priority=1,invocationCount =2)
public void test1()
{
	System.out.println("test1");
}
@Test(priority=2,dependsOnMethods = {"test1"})
public void test2()
{
	System.out.println("test2");
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
