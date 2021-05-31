package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
		
		@FindBy(linkText = "COURSE")
		private WebElement couselink;
		
		@FindBy(linkText  ="Selenium Training")
		private WebElement seleniumtraininglink;
		
		@FindBy(xpath = "(//button[@type='submit'])[2]")
		private WebElement addcartbutton;

		public WebElement getAddcartbutton() {
			return addcartbutton;
		}

		public WebElement getCouselink() {
			return couselink;
		}

		public WebElement getSeleniumtraininglink() {
			return seleniumtraininglink;
		}
		
		
		public void couselink() {
			couselink.click();
		}
		
		public void seleniumcouselink() {
			seleniumtraininglink.click();
		}
		
		public void addcart() {
			addcartbutton.click();
		}
		
		
	}


