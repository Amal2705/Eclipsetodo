package firstpckg;

import org.openqa.selenium.chrome.ChromeDriver;

public class homework2 
{

	public static void main(String[] args)
	{
		ChromeDriver am=new ChromeDriver();
		am.get("https://www.youtube.com/");
		String actual=am.getTitle();
		String excpected="Youtube";
				if(actual.equalsIgnoreCase(excpected))
				{
					System.out.println("pass");
				}
				else
				{
					System.out.println("fail");
				}
	}

}
