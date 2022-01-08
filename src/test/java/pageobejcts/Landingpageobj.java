package pageobejcts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.commonfucn;

public class Landingpageobj extends commonfucn {
	
	public Landingpageobj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="My Account") public WebElement myacc;
	@FindBy(linkText="Register") public WebElement register;

}
