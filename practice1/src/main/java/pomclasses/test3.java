package pomclasses;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test3 {
	
	@Test
	
	public void testswitch() {
		WebDriver driver=new ChromeDriver();
		
		Set<String> windid = driver.getWindowHandles();
		
		for(String b:windid) {
			driver.switchTo().window(b);
			
		}
	}

}
