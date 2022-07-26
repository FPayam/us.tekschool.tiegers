package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.RegisterPageObj;
import utilities.Utils;

public class RegisterSteps extends Base{

	RegisterPageObj registerPageObj = new RegisterPageObj();
	
	@When("i click on register link")
	public void i_click_on_register_link() {
		registerPageObj.clickOnRegisterLink();
		logger.info("Register link was clicked successfully");
	}

	@When("i fill registeration form")
	public void i_fill_registeration_form(DataTable dataTable) {
		//we have to store the data in list of map
		//list will define the row and map will define the column
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		registerPageObj.enterFirstName(data.get(0).get("firstname"));
		registerPageObj.enterLastName(data.get(0).get("lastname"));
		registerPageObj.enterEmail(data.get(0).get("email"));
		registerPageObj.enterTelephone(data.get(0).get("telephone"));
		registerPageObj.enterPassword(data.get(0).get("password"));
		registerPageObj.enterconfirmPassword(data.get(0).get("confirmPassword"));
		Utils.takeScreenshotForStep();
		logger.info("Registeration form is filled-out successfully");
	}

	@When("i subscribe to newsletter")
	public void i_subscribe_to_newsletter() {
		registerPageObj.clickOnYesRadioBttn();
		logger.info("YES for newsletter was clicked successfully");
	}

	@When("i agree to privacy policy")
	public void i_agree_to_privacy_policy() {
		registerPageObj.clickOnPrivacyPolicyCheckBox();
		logger.info("check box for privacy policy was clicked successfully");
	}

	@When("i click on continue button")
	public void i_click_on_continue_button() {
		registerPageObj.clickOnContinueBttn();
		logger.info("Continue button was clicked successfully");
	}

	@Then("i validate my account is created successfully")
	public void i_validate_my_account_is_created_successfully() {
		String expectedMessage = "Your Account Has Been Created!";
		String actualMessage = registerPageObj.getAccountCreatedMssgFromUI();
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("Expected & Actual Text was verified successfully");
	}
}
