package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterErrorPages {
	
	@FindBy(xpath="//div[text()='Warning: You must agree to the Privacy Policy!']")
	private WebElement errorWarning;
	
	@FindBy(xpath="//input[@id='input-firstname']/following-sibling::div")
	private WebElement firstNameErrorMessage;
	
	@FindBy(xpath="//input[@id='input-lastname']/following-sibling::div")
	private WebElement lastNameErrorMessage;
	
	@FindBy(xpath="//input[@id='input-email']/following-sibling::div")
	private WebElement emailError;
	
	@FindBy(xpath="//input[@id='input-telephone']/following-sibling::div")
	private WebElement errorTelephone;
	
	@FindBy(xpath="//input[@id='input-password']/following-sibling::div")
	private WebElement errorPassword;

	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement continueButton;
	
	
    public RegisterErrorPages(WebDriver driver) {
        
        PageFactory.initElements(driver, this);
               
}
    public String ErrorWarningMessage() {
    	return errorWarning.getText();
    	
    	
    }
    public String FirstNameErrorMessge() {
    	return firstNameErrorMessage.getText();
    	
    	
    } 
    public String LastNameErrorMessage() {
    	return lastNameErrorMessage.getText();
    	
    	
    } 
    public String EmailError() {
    	return emailError.getText();
    	
    	
    } 
    public String ErrorTelephone() {
    	return errorTelephone.getText();
        	
    }
    public String ErrorPassword() {
    	return errorPassword.getText();
        	
    }
    public boolean ErrorWarningMessageDisplayed(){
    	return errorWarning.isDisplayed();
        	
    }
    public boolean firstNameErrorMessageDisplayed(){
    	return firstNameErrorMessage.isDisplayed();
        	
    }
    public boolean lastNameErrorMessageDisplayed(){
    	return lastNameErrorMessage.isDisplayed();
        	
    }
    public boolean emailErrorDisplayed(){
    	return emailError.isDisplayed();
        	
    }
    public boolean errorTelephoneDisplayed(){
    	return errorTelephone.isDisplayed();
        	
    }
    public boolean errorPasswordDisplayed(){
    	return errorPassword.isDisplayed();
        	
    }
    
}
