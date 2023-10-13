package firstpckg;

import org.openqa.selenium.chrome.ChromeDriver;

public class homework
{

	public static void main(String[] args) 
	{
		ChromeDriver am=new ChromeDriver();
		am.get("https://www.mgu.ac.in/");
		String a=am.getPageSource();
		if(a.contains("infodesk"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	

}
