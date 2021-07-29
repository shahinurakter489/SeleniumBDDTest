package ups.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FedExHomePageElements {
	@FindBy(name = "trackingnumber")
	public WebElement trackingnumber;

	@FindBy(id = "btnSingleTrack")
	public WebElement trackButton;

	@FindBy(className = "systemErrorMessageTop")
	public WebElement errorMsg;

}
