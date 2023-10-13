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

public class robotclassfileupload 
{
ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@Test
public void todorobotclassinpdf() throws Exception 
{
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	
	fileupload("C:\\Users\\ahi78\\OneDrive\\Documents\\TEST SCENARIO.docx");
}
private void fileupload(String fileuploadkey) throws AWTException 
{
StringSelection strselection=new StringSelection(fileuploadkey);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);

Robot robot=new Robot();

robot.delay(3000);

robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent. VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);





robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

robot.delay(2000);



}
}

