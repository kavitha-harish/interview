package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pomclasses.homepage;
import utilities.Webdriverutilities;
import utilities.baseclass;


public class finaltest extends baseclass{
	
	@Test 
	
	
	public void withpom() throws Throwable {
		
		
	
		String Expected="SkillRary Courses";
		homepage home=new homepage(driver);
		Webdriverutilities webutil=new Webdriverutilities();
		String actual = driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, Expected);
		
		WebElement ele = driver.findElement(By.linkText("COURSE"));
		webutil.mouseover(driver, ele);
		
		home.seleniumcouselink();
		home.addcart();
		
		webutil.alertdismiss(driver);
		Assert.fail();
		
		
		
		
	}

}
