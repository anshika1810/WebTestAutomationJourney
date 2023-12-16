package JourneyTest.WebTestAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterUserPage {

	@FindBy(how = How.XPATH, using = "//a[@class = 'btn btn-success-outline']")
	private WebElement registerButton;

	@FindBy(how = How.ID, using = "username")
	private WebElement userName;

	@FindBy(how = How.ID, using = "firstName")
	private WebElement firstName;

	@FindBy(how = How.ID, using = "lastName")
	private WebElement lastName;

	@FindBy(how = How.ID, using = "password")
	private WebElement password;

	@FindBy(how = How.ID, using = "confirmPassword")
	private WebElement confirmPassword;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-default']")
	private WebElement loginButtonClick;

	@FindBy(how = How.XPATH, using = "//div[@class ='result alert alert-success']")
	private WebElement registrationMessage;

	@FindBy(how = How.XPATH, using = "//input[@name='login']")
	private WebElement loginUser;

	@FindBy(how = How.XPATH, using = "/html/body/my-app/header/nav/div/my-login/div/form/div/input[2]")
	private WebElement passwordUser;

	// a[text()='Logout']
	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	private WebElement logoutButtonUser;

	public WebElement getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(WebElement loginUser) {
		this.loginUser = loginUser;
	}

	public WebElement getPasswordUser() {
		return passwordUser;
	}

	public void setPasswordUser(WebElement passwordUser) {
		this.passwordUser = passwordUser;
	}

	public WebElement getLoginButtonClickHeader() {
		return loginButtonClickHeader;
	}

	public void setLoginButtonClickHeader(WebElement loginButtonClickHeader) {
		this.loginButtonClickHeader = loginButtonClickHeader;
	}

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-success']")
	private WebElement loginButtonClickHeader;

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public void setRegisterButton(WebElement registerButton) {
		this.registerButton = registerButton;
	}

	public WebElement getuserName() {
		return userName;
	}

	public void setuserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getRegistrationMessage() {
		return registrationMessage;
	}

	public void setRegistrationMessage(WebElement registrationMessage) {
		this.registrationMessage = registrationMessage;
	}

	public void setConfirmPassword(WebElement confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public WebElement getLoginButtonClick() {
		return loginButtonClick;
	}

	public void setLoginButtonClick(WebElement loginButtonClick) {
		this.loginButtonClick = loginButtonClick;
	}

	public WebElement getLogoutButtonUser() {
		return logoutButtonUser;
	}

	public void setLogoutButtonUser(WebElement logoutButtonUser) {
		this.logoutButtonUser = logoutButtonUser;
	}

}
