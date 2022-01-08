package pageobejcts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.commonfucn;

public class Registerpage extends commonfucn {
	
	public Registerpage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-firstname") public WebElement fname;
	@FindBy(id="input-lastname") public WebElement lanme;
	@FindBy(id="input-email") public WebElement email;
	@FindBy(id="input-telephone") public WebElement phone;
	@FindBy(id="input-password") public WebElement pass;
	@FindBy(id="input-confirm") public WebElement passconfrim;
	@FindBy(xpath="//input[@type='checkbox']") public WebElement chkbox;
	@FindBy(xpath="//input[@type='submit']") public WebElement submit;
}
