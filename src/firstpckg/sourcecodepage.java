package firstpckg;

import org.openqa.selenium.chrome.ChromeDriver;

public class sourcecodepage 
{

	public static void main(String[] args)
	{
		ChromeDriver am=new ChromeDriver();
		am.get("https://www.google.co.in/");
        String a=am.getPageSource();
        if(a.contains("Gmail"))
        {
        	System.out.println("pass");
        }
        else
        {
        	
        	System.out.println("fail");
        }
        
		

	}

}
