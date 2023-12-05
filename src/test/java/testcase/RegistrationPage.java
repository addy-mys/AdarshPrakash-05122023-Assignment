package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	@FindBy(xpath = "//span[text()='My Account']" )
	private WebElement myAccountButton;
	
	@FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a" )
	private WebElement myAccountRegisterButton;
	
	@FindBy(id = "input-firstname" )
	private WebElement firstNameTextField;
	
	@FindBy(id = "input-lastname" )
	private WebElement lastNAmeTextField;
	
	@FindBy(id = "input-email" )
	private WebElement eMailTextField;
	
	@FindBy(id ="input-telephone" )
	private WebElement telephoneTextField;
	
	@FindBy(id = "input-password" )
	private WebElement passwordTextField;
	
	@FindBy(id = "input-confirm" )
	private WebElement confirmpasswordTextField;
	
	@FindBy(name = "agree" )
	private WebElement agreecheckbox;
	
	@FindBy(xpath = "//input[@value=\"Continue\"]" )
	private WebElement myaccountcontinueButton;
	
	@FindBy(xpath= "/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a")
	private WebElement logoutButton;
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void MyAccountButton() {
		myAccountButton.click();
	}
	
	public void MyAccountRegisterButton() {
		myAccountRegisterButton.click();
	}
	
	public void FirstNameTextField() {
		firstNameTextField.sendKeys("Adarsh");
	}
	
	public void LasttNameTextField() {
		lastNAmeTextField.sendKeys("Prakash");
	}
	public void EmailTextField() {
		eMailTextField.sendKeys("adarsh125@yopmail.com");
	}
	public void TelephoneTextField() {
		telephoneTextField.sendKeys("9448280611");
	}
	public void PasswordTextField() {
		 passwordTextField.sendKeys("Test@123");
	}
	public void ConfirmPasswordTextField() {
		confirmpasswordTextField.sendKeys("Test@123");
	}
	public void AgreeCheckBox() {
		agreecheckbox.click();
	}
	public void ClickLogoutButton() {
		logoutButton.click();
	}
	public void ClickmyaccountcontinueButton() {
		myaccountcontinueButton.click();
	}
}
