package ups.StepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ups.pageActions.UpsSignUpActionsPage;
import ups.utilities.DriverSetup;

public class UpsSignUpPageStepDef {
	
	UpsSignUpActionsPage upssignUpactionsPage = new UpsSignUpActionsPage();
	@Given("Customer in UPS sign up page")
	public void customer_in_UPS_sign_up_page() {
		 upssignUpactionsPage.getUpsSignUpPage();
	}

	@When("user gives input the name {string}")
	public void user_gives_input_the_name(String name) {
		upssignUpactionsPage.userName(name);
	}

	@When("user gives  input email {string}")
	public void user_gives_input_email(String email) {
		upssignUpactionsPage.userEmail(email);
	}

	@When("user gives input userid\"shahinur akter\"")
	public void user_gives_input_userid_shahinur_akter() {
		upssignUpactionsPage.toString();
	}

	@When("user gives input password\"{int}\"")
	public void user_gives_input_password(Integer int1) {
		upssignUpactionsPage.userPassword(null);
	}

	@When("user enter the phone number\"{int}\"")
	public void user_enter_the_phone_number(Integer int1) {
		upssignUpactionsPage.userPhonenumber(null);
	}

	@When("user  clicks the Agreement button")
	public void user_clicks_the_Agreement_button() {
		upssignUpactionsPage.checkBox(null);
	}

	@Then("user should be able to sign up")
	public void user_should_be_able_to_sign_up() {
	   String expectedURL ="https://www.ups.com/us/en/Home.page?";
	   String acturalURL = DriverSetup.chromeDriver.getCurrentUrl();
	   Assert.assertEquals(acturalURL, expectedURL);
	}

}
