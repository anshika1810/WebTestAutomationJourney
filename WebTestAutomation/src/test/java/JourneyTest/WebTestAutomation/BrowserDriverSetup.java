package JourneyTest.WebTestAutomation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BrowserDriverSetup {
	
	public static Logger log;
	WebDriver driver;


	public WebDriver getChromeDriver() {
		log = LogManager.getLogger(BrowserDriverSetup.class);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		driver = new ChromeDriver(options);		
		return driver;
	}


}
