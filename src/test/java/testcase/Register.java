package testcase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Baseclass;
public class Register extends Baseclass{
	private RegisterErrorPages registerErrorPages;
    private Homepage homePage;
    private RegistrationPage registrationpage;
    private LoginPage loginPage;
    
    
@Test (priority= 1)
	public void verifyRegisterErrorMessages() {
	registerErrorPages = new RegisterErrorPages(driver);
	homePage = new Homepage(driver);
	
	SoftAssert softAssert = new SoftAssert();

	homePage.clickMyAccountButton();
	homePage.clickMyAccountRegisterButton();
	homePage.clickRegisterContinue();
	
	softAssert.assertTrue(registerErrorPages.ErrorWarningMessageDisplayed());
	System.out.println(registerErrorPages.ErrorWarningMessage());
	softAssert.assertTrue(registerErrorPages.firstNameErrorMessageDisplayed());
	System.out.println(registerErrorPages.FirstNameErrorMessge());
	softAssert.assertTrue(registerErrorPages.lastNameErrorMessageDisplayed());
	System.out.println(registerErrorPages.LastNameErrorMessage());
	softAssert.assertTrue(registerErrorPages.errorPasswordDisplayed());
	System.out.println(registerErrorPages.ErrorPassword());
	softAssert.assertTrue(registerErrorPages.emailErrorDisplayed());
	System.out.println(registerErrorPages.EmailError());
	softAssert.assertTrue(registerErrorPages.errorTelephoneDisplayed());
	System.out.println(registerErrorPages.ErrorTelephone());
	softAssert.assertTrue(registerErrorPages.errorPasswordDisplayed());
	System.out.println(registerErrorPages.ErrorPassword());
	
		
}
	
		
		@Test(priority= 2)
		public void NewRegistrationFlow() {
			registrationpage = new RegistrationPage(driver);
			homePage = new Homepage(driver);
			
			
			registrationpage.MyAccountButton();
			registrationpage.MyAccountRegisterButton();
			registrationpage.FirstNameTextField();
			registrationpage.LasttNameTextField();
			registrationpage.EmailTextField();
			registrationpage.TelephoneTextField();
			registrationpage.PasswordTextField();
			registrationpage.ConfirmPasswordTextField();
			registrationpage.AgreeCheckBox();
			registrationpage.ClickmyaccountcontinueButton();
			registrationpage.MyAccountButton();	
			registrationpage.ClickLogoutButton();		
			
		
			}
		@Test(priority= 3)
		public void LoginFlow() {
			registrationpage = new RegistrationPage(driver);
			homePage = new Homepage(driver);
			loginPage = new LoginPage(driver);			
			SoftAssert softAssert = new SoftAssert();
			
			
			loginPage.ClickMyAccountButton();
			loginPage.ClickMyAccountLoginButton();
			loginPage.SendkeysMyAccountEmailTf();
			loginPage.SendkeysMyAccountPwdTf();
			loginPage.ClickMyAccountLogin();
			
			softAssert.assertTrue(loginPage.MyAccountTxt());
			System.out.println(loginPage.MyAccountTxtDisplayed());

			softAssert.assertTrue(loginPage.Myordertxt());
			System.out.println(loginPage.MyordertxtDisplayed());
			
			softAssert.assertTrue(loginPage.MyAffiliatetxt());
			System.out.println(loginPage.MyAffiliatetxtDisplayed());
			
			softAssert.assertTrue(loginPage.NewLettertxt());
			System.out.println(loginPage.NewLettertxtDisplayed());
			
			
			
			
		}
}
