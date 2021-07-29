package ups.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import ups.pageElements.UPsSignUpElements;
import ups.utilities.DriverSetup;

public class UpsSignUpActionsPage {
	UPsSignUpElements signup ;

public UpsSignUpActionsPage() {
	this.signup = new UPsSignUpElements();
	//initElements(WebDriver driver, object page)
	PageFactory.initElements(DriverSetup.chromeDriver, signup);
	
	
}

public void getUpsSignUpPage()  {
	DriverSetup.chromeDriver.get("https://wwwapps.ups.com/doapp/signup?");
	DriverSetup.chromeDriver.manage().window().maximize();
	DriverSetup.chromeDriver.manage().deleteAllCookies();
	DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	DriverSetup.chromeDriver.close();
	
}

public void userName(String name) {
	signup.username.sendKeys(name);
}
public void userEmail(String email) {
	signup.useremail.sendKeys(email);
}
public void userPassword(String password) {
	signup.password.sendKeys(password);
}
public void userPhonenumber(String phonenumber) {
	signup.Userphonenumber.sendKeys(phonenumber);
}

public void checkBox(String checkbox) {
	signup.checkBox.click();
}
public void submitButton() {
	signup.submitButton.click();
}
public String errorMessage() {
	String error = signup.errorMessage.getText();
	return error;
}












}