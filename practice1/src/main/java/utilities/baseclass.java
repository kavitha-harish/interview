package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class baseclass {
	public WebDriver driver;
	public static WebDriver sdriver;
	Webdriverutilities wu=new Webdriverutilities();
	public ExtentSparkReporter htmlreport;
	public ExtentReports extent;
	public ExtentTest test;

	
	@BeforeClass
	public void beforeclass() {
		
		htmlreport=new ExtentSparkReporter("./reports/extent.html");
		htmlreport.config().setDocumentTitle("automation report");
		htmlreport.config().setReportName("automation test results");
		htmlreport.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.setSystemInfo("browser", "chrome");
		extent.attachReporter(htmlreport);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
	@BeforeMethod
	
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	
	public void closebrowser()
	{
		driver.close();
	}
}
