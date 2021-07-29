package ups.pageActions;

import org.openqa.selenium.support.PageFactory;

import ups.pageElements.FedExHomePageElements;
import ups.utilities.DriverSetup;

public class FedExHomePageActions {
	FedExHomePageElements fedExHomePageElement;
	
	public FedExHomePageActions () {
		this.fedExHomePageElement = new FedExHomePageElements();
		PageFactory.initElements(DriverSetup.chromeDriver, fedExHomePageElement);
	}
	
	public void trackingInput(String trackingNumber) {
		fedExHomePageElement.trackingnumber.sendKeys(trackingNumber);
	}
	
	public void clickTrackBtn() {
		fedExHomePageElement.trackButton.click();
	}
	
	public String trackerrorMsg() {
		String error = fedExHomePageElement.errorMsg.getText();
		return error;
	}
	
}
