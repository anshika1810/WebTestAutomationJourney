package JourneyTest.WebTestAutomation;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterUserTest extends BrowserDriverSetup {

	WebDriver driver;
	RegisterUserPage page;
	String generatedString = RandomStringUtils.random(5, true, false);

	@BeforeTest
	public void setup() {

		driver = new BrowserDriverSetup().getChromeDriver();
		page = PageFactory.initElements(driver, RegisterUserPage.class);
		driver.get("https://buggy.justtestit.org/ ");
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void registerUser() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		page.getRegisterButton().click();
		page.getuserName().sendKeys(generatedString);
		page.getFirstName().sendKeys("Anshika");
		page.getLastName().sendKeys("Srivastava");
		page.getPassword().sendKeys("Test123$");
		page.getConfirmPassword().sendKeys("Test123$");
		page.getLoginButtonClick().click();
		String actualRegistrationMsg = page.getRegistrationMessage().getText();
		String expectedRegistartionMsg = "Registration is successful";
		if (actualRegistrationMsg.equals(expectedRegistartionMsg)) {
			Assert.assertTrue(true);
			log.info("User is registered");

		}

		else {
			log.info("User Registration Failed");
		}

	}

	@Test(priority = 1)
	public void loginUser() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		page.getLoginUser().sendKeys(generatedString);
		page.getPasswordUser().sendKeys("Test123$");
		page.getLoginButtonClickHeader().click();
		log.info("User logged in");

	}

	public void logout() {
		page.getLogoutButtonUser().click();
		log.info("User logged out successfully");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}

}
