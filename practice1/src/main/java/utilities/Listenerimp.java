package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerimp implements ITestListener{
	
	public void Ontestfailure(ITestResult result) throws Throwable{
		String currentdate = new Date().toString();
		
		String failedtestcase = result.getMethod().getMethodName();
		EventFiringWebDriver ed=new EventFiringWebDriver(baseclass.sdriver);
		File src = ed.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/"+failedtestcase+currentdate+".png");
			
		}
	}


