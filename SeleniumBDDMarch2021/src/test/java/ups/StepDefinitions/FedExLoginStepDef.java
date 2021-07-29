package ups.StepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ups.pageActions.FedExLoginActionPage;
import ups.utilities.DriverSetup;

public class FedExLoginStepDef {
	FedExLoginActionPage fedExLoginActionPage = new FedExLoginActionPage();
	
	
	@Given("user in FedEx login page")
	public void user_in_FedEx_login_page1() {
		fedExLoginActionPage.getFedExLoginPage();
	}

	@When("user gives userid input {string}")
	public void user_gives_userid_input(String UserId) {
		fedExLoginActionPage.inputUserID(UserId);
	}

	@When("user gives password input {string}")
	public void user_gives_password_input(String password) {
		fedExLoginActionPage.inputPassword(password);

	}

	@When("user click the submit button")
	public void user_click_the_submit_button() {
		fedExLoginActionPage.clickSubmitButton();

	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
		String  expectedURL="https://www.fedex.com/en-us/home.html";
		String actualURL = DriverSetup.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);

	}

	@Given("user  in FedEx login page")
	public void user_in_FedEx_login_page() {
		fedExLoginActionPage.getFedExLoginPage();
	}

	@Then("user should not be able to login")
	public void user_should_not_be_able_to_login() {

		String expectedURL ="https://www.fedex.com/en-us/home.html";
		String actualURL= DriverSetup.chromeDriver.getCurrentUrl();
		Assert.assertNotEquals(expectedURL,actualURL);
	}



}
