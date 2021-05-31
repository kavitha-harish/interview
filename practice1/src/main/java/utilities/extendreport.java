package utilities;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class extendreport extends baseclass implements ITestListener {
	
	ExtentReports reports;
	ExtentTest test;
	
	
	
	public void ontestfailure(ITestResult result) {
		
		ExtentSparkReporter htmlReporter=new ExtentSparkReporter("./reports/extent.html");
		htmlReporter.config().setDocumentTitle("applicationname");
		htmlReporter.config().setReportName("testtype");
		
		reports=new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		test.log(Status.FAIL, result.getMethod().getMethodName());
		
		
		String currentdate = new Date().toString();
		String failedtestcase = result.getMethod().getMethodName();
		EventFiringWebDriver ed=new EventFiringWebDriver(baseclass.sdriver);
		sdriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		File src = ed.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/"+failedtestcase+currentdate+".png");
		
		try {
			
		
		FileUtils.copyFile(src, des);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(failedtestcase);
	}
		
	
			
	}

	



	
	
