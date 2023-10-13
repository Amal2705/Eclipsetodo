package Testngpckg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datadriventestfb
{
 ChromeDriver driver;
 
 @BeforeTest
 public void setup()
 {
	 driver=new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/");
	 
 }
 
 @Test
 public void tododatadrivinfb() throws IOException//ElementClickInterceptedException
 {
	FileInputStream fi=new FileInputStream("C:\\Users\\ahi78\\OneDrive\\Desktop\\fbuserpass.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet sh=wb.getSheet("fblogin");
	 int lastrow=    sh.getLastRowNum();
	 
	 for(int i=1;i<=lastrow;i++)
	 {
		String email =sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println("email = "+email);
		
		String password=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println("password = "+password);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		driver.navigate().refresh();
	 }
	 
 }
}
