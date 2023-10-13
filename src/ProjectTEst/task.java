package ProjectTEst;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import firstpckg.xpath;

public class task 
{
WebDriver driver;

@FindBy(xpath = "//*[@id=\"user-name\"]")
WebElement username;

@FindBy(xpath = "//*[@id=\"password\"]")
WebElement password;

@FindBy(xpath = "//*[@id=\"login-button\"]")
WebElement loginbutton;

@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
WebElement product1;

@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
WebElement product2;

@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
WebElement product3;

@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
WebElement product4;

@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
WebElement product5;

@FindBy(xpath = "//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
WebElement product6;

@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
WebElement cart;

@FindBy(xpath = "//*[@id=\"checkout\"]")
WebElement checkoutbutton;

@FindBy(xpath = "//*[@id=\"first-name\"]")
WebElement firstname;

@FindBy(xpath = "//*[@id=\"last-name\"]")
WebElement lastname;

@FindBy(xpath = "//*[@id=\"postal-code\"]")
WebElement postalcode;

@FindBy(xpath = "//*[@id=\"continue\"]")
WebElement continuing;

@FindBy(xpath = "//*[@id=\"finish\"]")
WebElement finish;

@FindBy(xpath = "//*[@id=\"back-to-products\"]")
WebElement backhome;

@FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
WebElement menu;

@FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
WebElement logout;






public task(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements( driver,this);
}

public void tododatadriveninsauce() throws IOException
{
	FileInputStream fi=new FileInputStream("C:\\Users\\ahi78\\OneDrive\\Desktop\\SauceUSER.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet sh=wb.getSheet("Saucesheet");
	 int lastrow=    sh.getLastRowNum();
	 
	 for(int i=1;i<=lastrow;i++)
	 {
		String usernamekey =sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println("username = "+usernamekey);
		
		
		String passwordkey=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println("password = "+passwordkey);
		
		username.sendKeys(usernamekey);
		password.sendKeys(passwordkey);
		loginbutton.click();
		driver.navigate().refresh();
	 }
}

public void todoclick()
{
	product1.click();
	product2.click();
	product3.click();
	product4.click();
	product5.click();
	product6.click();
	cart.click();
	checkoutbutton.click();
	
}

public void userinformation(String firstnamkey,String lastnamekey,String postalcodekey)
{
	firstname.sendKeys(firstnamkey);
	lastname.sendKeys(lastnamekey);
	postalcode.sendKeys(postalcodekey);
	
	
}

public void userinformationclick() throws InterruptedException
{
	continuing.click();
	finish.click();
	backhome.click();
	menu.click();
	Thread.sleep(8000);
	
	logout.click();
}




}
