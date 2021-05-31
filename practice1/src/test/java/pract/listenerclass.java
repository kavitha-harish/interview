package pract;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class listenerclass {
	@Test
	public void mytest() {
		String Expected="SkillRary Courses";
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String actual = driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, Expected);
		driver.close();
		
	}

}
