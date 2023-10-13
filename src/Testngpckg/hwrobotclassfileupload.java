package Testngpckg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.netty.handler.codec.http.multipart.FileUpload;

public class hwrobotclassfileupload 
{
ChromeDriver driver;
@BeforeTest
public void setup() 
{
	driver=new ChromeDriver();
}
@Test
public void todorobotclassfileuploa() throws Exception 
{
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	
	FileUpload("C:\\Users\\ahi78\\OneDrive\\Documents\\abhishek.docx");
}
private void FileUpload(String fileuploadkey) throws AWTException 
{
	StringSelection strselection=new StringSelection(fileuploadkey);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
	
	Robot robotclass=new Robot();
	
	robotclass.delay(3000);
	
	
	robotclass.keyPress(KeyEvent.VK_CONTROL);
	robotclass.keyPress(KeyEvent.VK_V);
	robotclass.keyRelease(KeyEvent.VK_V);
	robotclass.keyRelease(KeyEvent.VK_CONTROL);
	
	
	
	
	robotclass.keyPress(KeyEvent.VK_ENTER);
	robotclass.keyRelease(KeyEvent.VK_ENTER);
	
	
	robotclass.delay(2000);
	
	
}
}
