package pract;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extendreport {
	public ExtentSparkReporter htmlreport;
	public ExtentReports extent;
	public ExtentTest test;
	WebDriver driver;
	
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
	
	@AfterClass
public void afterclass() {
		driver.quit();
		extent.flush();
		
	}
		
		@Test
		
		public void create() throws Throwable {
			
		String Expected="SkillRary Courses";
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		String actual = driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, Expected);// verifying title
		test=extent.createTest("passed");
		test.log(Status.PASS, "passed");

}}
