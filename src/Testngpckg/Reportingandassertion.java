package Testngpckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reportingandassertion 
{
	WebDriver driver;
	String baseurl="https://www.facebook.com/";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
@BeforeTest
public void Testingprofile()
{
	reporter=new ExtentHtmlReporter("./REPORTS/myreport1.html");
	reporter.config().setDocumentTitle("Automation Report");
	reporter.config().setReportName("Functional Test");
	reporter.config().setTheme(Theme.STANDARD);
	
	    
	      extent=new ExtentReports();
	      extent.attachReporter(reporter);
	      extent.setSystemInfo("Hostname", "Localhost");
	      extent.setSystemInfo("OS", "Windows11");
	      extent.setSystemInfo("Tester Name", "Amal");
	      extent.setSystemInfo("Browser Name","Chrome");
	      
	      
	      driver=new ChromeDriver();
	
}

@BeforeMethod
public void setup()
{
	driver.get(baseurl);
}

@Test
public void todoinfb()
{
	test=extent.createTest("FB Title Verification");
	String Actual=driver.getTitle();
	String Expected="facebook";
	Assert.assertEquals(Actual,Expected);
	
}

@AfterTest
public void toperformfully()
{
	extent.flush();
}

@AfterMethod
public void browserclose(ITestResult result)
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
	test.log(Status.FAIL, "test case failed"+result.getName());
	test.log(Status.FAIL, "test is failed cz"+result.getThrowable());
	}
	
	else if(result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP, "test is skipped cz"+result.getName());
	}
	
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS,"test is success"+result.getName());
	}
	
}


}
