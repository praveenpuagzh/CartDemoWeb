package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.commonfucn;
import pageobejcts.Landingpageobj;
import pageobejcts.Registerpage;

public class login_test extends commonfucn {

	public void register() {

		Landingpageobj lp = new Landingpageobj();
		Actions actions = new Actions(driver);
		actions.moveToElement(lp.myacc).click().perform();
		actions.moveToElement(lp.register).click().perform();

	}
	
	public void register_details() {
	
		Registerpage rp = new Registerpage();
		filltext(rp.fname, "praveen");
		filltext(rp.lanme, "kumar");
		filltext(rp.email, "praveenpugazh84@gmail.com");
		filltext(rp.phone, "9597514715");
		filltext(rp.pass, "Hulk@123");
		filltext(rp.passconfrim, "Hulk@123");
		rp.chkbox.click();
		rp.submit.click();
		logger.info("registration sucessful");

	}

	@Test
	public void f() {

		register();
		logger.info("register sucess");
		register_details();
	}
}
