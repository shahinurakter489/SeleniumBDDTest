package ups.pageActions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import ups.pageElements.UpsLoginPageElements;
import ups.utilities.DriverSetup;

public class UpsLoginPageActions {

	UpsLoginPageElements loginElements;

	public UpsLoginPageActions() {

		this.loginElements = new UpsLoginPageElements();

		// initElements(WebDriver driver, Object page)
		PageFactory.initElements(DriverSetup.chromeDriver, loginElements);

	}

	public void getUpsLoginPage() {
		DriverSetup.chromeDriver.get("https://www.ups.com/lasso/login?");
		DriverSetup.chromeDriver.manage().window().maximize();
		DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void inputUserId(String userId) {
		loginElements.userId.sendKeys(userId);

	}

	public void inputPassword(String password) {
		loginElements.password.sendKeys(password);

	}

	public void selectRememberUserId() {
		loginElements.rememberUserId.click();
	}

	public void clickSubmitButton() {
		loginElements.submitButton.click();
	}

	public String errorMessage() {
		String error = loginElements.errorMessage.getText();
		return error;
	}

}
