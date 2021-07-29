package ups.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UPsSignUpElements {

	@FindBy(id = "name")
	public WebElement username;

	
	@FindBy(id = "email")
	public WebElement useremail;

	@FindBy(id = "UserId")
	public WebElement userId;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(id = "//*[@id=\"ups-phone_input\"]")
	public WebElement Userphonenumber;

	@FindBy(className = "//*[@class=\"ups-checkbox-custom-label\"]")
	
	public WebElement checkBox;

	@FindBy(xpath ="//*[contains(text(),\"Sign Up\")]")
	public WebElement submitButton;

	@FindBy(id = "errorMessages")
	public WebElement errorMessage;
}
