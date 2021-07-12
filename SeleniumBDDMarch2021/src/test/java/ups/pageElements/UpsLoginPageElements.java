package ups.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsLoginPageElements {

	@FindBy(id = "email")
	public WebElement userId;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(xpath = "//label[@class='ups-form_label ups-checkbox-custom-label']")
	public WebElement rememberUserId;

	@FindBy(xpath = "//*[@id='submitBtn']")
	public WebElement submitButton;

	@FindBy(id = "errorMessages")
	public WebElement errorMessage;

}
