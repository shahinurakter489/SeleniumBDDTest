package ups.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FedExLoginElements {
@FindBy(id="email")
public WebElement userId;
@FindBy(name="password")
public WebElement password;
@FindBy(xpath="//*[contains(text(),\"Remember Me\")]")
public WebElement rememberuserID;

@FindBy(xpath="//*[contains(text(),\"LOG IN\")]")
public WebElement submitButton;
@FindBy(id="errorMessage")
public WebElement errorMessage;




}
