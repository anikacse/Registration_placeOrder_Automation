package stepdefinitions;

import org.junit.Assert;

import com.pages.Login;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private static String title;
	private Login login = new Login(DriverFactory.getDriver());
	
    @Given("User go to the NopCommerce Home page")
    public void user_go_to_the_nopcommerce_home_page() {
    	DriverFactory.getDriver().get("https://training.nop-station.com/");
    }
    
    @And("User navigate to the Registration page")
    public void user_navigate_to_the_registration_page() {
    }
        
    @When("User select the {string} as gender")
    public void user_select_the_as_gender(String expectedGender) {
    	Assert.assertTrue(title.contains("expectedGender"));
    }

    @Then("Verify that the new account registration message is displayed {String}")
    public void verify_that_the_new_account_registration_message_is_displayed(String msg) {
    	login.enterMsg(msg);
    }

    @And("User set first name {String} and last name {String}")
    public void user_set_first_name_and_last_name(String firstName, String lastName) {
        login.enterUserName(firstName, lastName);
    }

    @And("User set as date of birth {String}")
    public void user_set_as_date_of_birth(String dob) {
        login.dob(dob);
    }

    @And("User set as email {String}")
    public void user_set_as_email(String dynamicemail) {
        login.email(dynamicemail);
    }

    @And("User set as company details {String}")
    public void user_set_as_company_details(String companyname) {
        login.companyName(companyname);
    }

    @And("User set Newsletter option as {String}")
    public void user_set_newsletter_option_as(String status) {
        login.status(status);
    }

    @And("^User set as password {String} and confirm password again")
    public void user_set_as_password_and_confirm_password_again(String password) {
    	login.enterPassword(password);
    }

    @And("User click on the Register button")
    public void user_click_on_the_register_button() {
    	login.clickOnLogin();
    }

}
