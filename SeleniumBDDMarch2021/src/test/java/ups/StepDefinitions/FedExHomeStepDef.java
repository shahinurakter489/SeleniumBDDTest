package ups.StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ups.pageActions.FedExHomePageActions;
import ups.utilities.DriverSetup;

public class FedExHomeStepDef {
	
	FedExHomePageActions fedExHomePageActions =new FedExHomePageActions();
	
	@Given("user in the FedEx home page")
	public void user_in_the_FedEx_home_page() {
	   String expectedUrl ="https://www.fedex.com/en-us/home.html";
	   DriverSetup.chromeDriver.get(expectedUrl);
	   Assert.assertEquals(DriverSetup.chromeDriver.getCurrentUrl(),expectedUrl );
	   DriverSetup.chromeDriver.manage().window().maximize();
	   DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	   Assert.assertEquals(DriverSetup.chromeDriver.getCurrentUrl(),expectedUrl);
	   System.out.println("<<FedEx home page>>");
	
	
	
	}

	@When("user gives invalid tracking number\"track-{int}\"")
	public void user_gives_invalid_tracking_number_track(Integer int1) {
		fedExHomePageActions.trackingInput(null);
	}

	@When("user click teh track button")
	public void user_click_teh_track_button() {
		fedExHomePageActions.clickTrackBtn();
	}

	@Then("user should receive error message")
	public void user_should_receive_error_message() {
	String error = fedExHomePageActions .trackerrorMsg();
	if(error.toLowerCase().contains("invalid")) {
		System.out.println("passed");
	}else {
		System.out.println("failed");
		Assert.fail();
	}
	}
}
