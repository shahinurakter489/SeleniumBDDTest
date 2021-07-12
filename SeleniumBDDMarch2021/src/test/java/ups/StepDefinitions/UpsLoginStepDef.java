package ups.StepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ups.pageActions.UpsLoginPageActions;
import ups.utilities.DriverSetup;

public class UpsLoginStepDef {

	UpsLoginPageActions upsLoginPageAction = new UpsLoginPageActions();

	@Given("Customer in UPS login page")
	public void customer_in_UPS_login_page() {
		upsLoginPageAction.getUpsLoginPage();
	}

	@When("Customer gives userid input {string}")
	public void customer_gives_userid_input(String userId) {
		upsLoginPageAction.inputUserId(userId);
	}

	@When("Customer gives password input {string}")
	public void customer_gives_password_input(String password) {
		upsLoginPageAction.inputPassword(password);
	}

	@When("Customer clicks the submit button")
	public void customer_clicks_the_submit_button() {
		upsLoginPageAction.clickSubmitButton();
	}

	@Then("Customer should be able to login")
	public void customer_should_be_able_to_login() {
		String expectedURL = "https://www.ups.com/us/en/Home.page";
		String actualURL = DriverSetup.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);

	}
	
	@Then("Customer should NOT be able to login")
	public void customer_should_NOT_be_able_to_login() {
		String expectedURL = "https://www.ups.com/us/en/Home.page";
		String actualURL = DriverSetup.chromeDriver.getCurrentUrl();
		Assert.assertNotEquals(expectedURL, actualURL);

	}

}
