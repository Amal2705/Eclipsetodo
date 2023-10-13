package Testngpckg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizationpgm 
{
	@Parameters({"a"})
 @Test
 public void todoparameterization(String name)
 {
	 System.out.println(name);
 }
}
