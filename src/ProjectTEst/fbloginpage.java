package ProjectTEst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbloginpage
{
WebDriver driver;

@FindBy(id = "email")
WebElement fbemail;

@FindBy(id="pass")
WebElement fbpassword;

@FindBy(name="login")
WebElement fbloginbutton;

public fbloginpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}

public void setvalues(String email,String Password)
{
	fbemail.sendKeys(email);
	fbpassword.sendKeys(Password);
	
}

public void loginclick()

{
	fbloginbutton.click();
}



}
