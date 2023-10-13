package Testngpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class scrolldown
{
WebDriver driver;

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
}

@Test
public void todoscrolldowninamazon()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[3]/a")).click();
}
}
