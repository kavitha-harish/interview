package pract;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	
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
	
	
	WebElement mouse = driver.findElement(By.linkText("COURSE"));
	Actions act=new Actions(driver);
	act.moveToElement(mouse).perform();
	WebElement p1 = driver.findElement(By.linkText("Selenium Training"));// mouseover
	
	
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(p1));
	p1.click();
	
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	Alert alertpop = driver.switchTo().alert();
	//alertpop.accept();
	alertpop.dismiss();
	
	
	
	driver.findElement(By.linkText("SIGNUP")).click();
	driver.close();	
	}

}
