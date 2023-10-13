package firstpckg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstfirstscript
{

	public static void main(String[] args) 
	{
		//   chromedriver
	   //    firfoxdriver
	  //     edgedriver
		
		
		  //chromedriver
		
		  ChromeDriver driver=new ChromeDriver();  // browser launch
		  driver.get("https://www.google.com");    // open application
         
          String actual= driver.getTitle();
          String expected="Google";
          
          if( actual.equals(expected))
          {
        	  
        	  System.out.println("pass");
          }
          else
          {
        	  System.out.println("fail");
          }
	}

}
