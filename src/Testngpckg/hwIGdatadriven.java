package Testngpckg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hwIGdatadriven
{
ChromeDriver driver;

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/");
}

@Test
public void tododatadrininIG() throws IOException, InterruptedException
{
	FileInputStream fi=new FileInputStream("C:\\Users\\ahi78\\OneDrive\\Desktop\\fbuserpass.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet sh=wb.getSheet("fblogin");
	 int lastset= sh.getLastRowNum();
	 
	 for(int i=1;i<=lastset;i++)
	 {
		String username=sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println("username = "+username);
		
		String password=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println("password = "+password);
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		 
	 }
	
	
}
}
