package ups.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import ups.pageElements.FedExLoginElements;
import ups.utilities.DriverSetup;

public class FedExLoginActionPage {
FedExLoginElements fedExloginElements ;

public  FedExLoginActionPage () {
	this.fedExloginElements = new FedExLoginElements();
	PageFactory.initElements(DriverSetup.chromeDriver, fedExloginElements);
}

public void getFedExLoginPage() {
	DriverSetup.chromeDriver.get("https://www.fedex.com/en-us/home.html");
	DriverSetup.chromeDriver.manage().window().maximize();
	DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	DriverSetup.chromeDriver.close();
	
}
public void inputUserID(String userId) {
	fedExloginElements.userId.sendKeys(userId);
	
}
public void inputPassword(String password) {
	fedExloginElements.password.sendKeys(password);
}
public void selectRememberUserId() {
	fedExloginElements.rememberuserID.click();
	
}
public void clickSubmitButton() {
	fedExloginElements.submitButton.click();
}
public String errorMessage() {
	String error = fedExloginElements.errorMessage.getText();
	return error;
}
}
