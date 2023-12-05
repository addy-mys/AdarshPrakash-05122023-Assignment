package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class LoginPage {
	@FindBy(xpath = "//span[text()='My Account']")
		private WebElement myAccountButton;
		@FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")
		private WebElement myAccountLoginButton;
		@FindBy (id = "input-email")
		private WebElement myAccountEmailTf;
		@FindBy (id = "input-password")
		private WebElement myAccountPwdTf;
		@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/input")
		private WebElement myAccountLogin;
		@FindBy (xpath = "//h2[text()='My Account']")
		private WebElement myAccountTxt;
		
		@FindBy(xpath="//h2[text()= 'My Account']")
		private WebElement myAccounttxt;
		
		@FindBy(xpath="//h2[text()= 'My Orders']")
		private WebElement myordertxt;
		
		@FindBy(xpath="//h2[text()= 'My Affiliate Account']")
		private WebElement myAffiliatetxt;

		@FindBy(xpath="//h2[text()= 'Newsletter']")
		private WebElement newLettertxt;
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
			
		}
		public void ClickMyAccountButton() {
			myAccountButton.click();
		}
		public void ClickMyAccountLoginButton() {
			myAccountLoginButton.click();
		}
		public void SendkeysMyAccountEmailTf() {
			myAccountEmailTf.sendKeys("adarsh125@yopmail.com");
		}
		public void SendkeysMyAccountPwdTf() {
			myAccountPwdTf.sendKeys("Test@123");
		}
		public void ClickMyAccountLogin() {
			myAccountLogin.click();
		}
		
		public boolean MyAccountTxt() {
			return myAccountTxt.isDisplayed();
		}
		public String MyAccountTxtDisplayed() {
			return myAccountTxt.getText();
		}
		public boolean Myordertxt() {
			return myordertxt.isDisplayed();
		}
		public String MyordertxtDisplayed() {
			return myordertxt.getText();
		}
		public boolean MyAffiliatetxt() {
			return myAffiliatetxt.isDisplayed();
		}
		public String MyAffiliatetxtDisplayed() {
			return myAffiliatetxt.getText();
		}
		public boolean NewLettertxt() {
			return newLettertxt.isDisplayed();
		}
		public String NewLettertxtDisplayed() {
			return newLettertxt.getText();
		}

}
