package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class commonfucn {
	public static WebDriver driver = null;
	public static Properties properties = null;
	public static Logger logger = Logger.getLogger(commonfucn.class);

	// load and return property
	public Properties loadproperty() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileInputStream);
		return properties;
	}
	
	public void filltext(WebElement ref , String text) {
	ref.sendKeys(text);
	}
	
	

	@BeforeSuite
	public void launchbrowser() throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Exection stated");
		loadproperty();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@AfterSuite
	private void teardown() {
		logger.info("Exection ended");
		// driver.quit();

	}
}
