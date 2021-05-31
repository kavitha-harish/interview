package utilities;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Webdriverutilities {
	
	public void wait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void mouseover(WebDriver driver, WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}

	public void alertaccept(WebDriver driver) {
		Alert al = driver.switchTo().alert();
		al.accept();
		
	}
	public void alertdismiss(WebDriver driver) {
		Alert al = driver.switchTo().alert();
		al.dismiss();
		
	}
	public void date() {
		Date date = new Date();
		String out = date.toString();
		String out1 = out.replace(":", "_").replace(" ", "_");
		
		
	}
	public String takeScrenShot(WebDriver driver, String screenshotname) throws Throwable 
	{
		String screenshotpath="./screenshot/"+screenshotname+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(screenshotpath);
		
		Files.copy(src, dest);
		return screenshotpath;
	}
	
	
	
}
