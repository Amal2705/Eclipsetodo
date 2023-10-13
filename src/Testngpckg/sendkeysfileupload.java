package Testngpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sendkeysfileupload 
{
 ChromeDriver driver;
 
 @BeforeTest
 public void setup()
 {
	 driver=new ChromeDriver();
	 
 }
 
 @Test
 public void todosendkeysfileupload() 
 {
	 driver.get("https://demo.guru99.com/test/upload/");
	 driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("D:\\screenshots\\youtubess.png");
	 driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
 }
}

