package uk.co.sja.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uk.co.sja.domain.RegisterDomain;
import uk.co.sja.pages.HomePage;
import uk.co.sja.pages.RegisterPage;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class RegisterStep {

    HomePage HomePage = new HomePage();
    RegisterDomain registerDomain = new RegisterDomain();

    @Given("I am on SJA home page")
    public void iAmOnSJAHomePage() throws IOException {
        HomePage.visit();
    }

    @And("I register {string}, {string}, {string}, {string}, {string}, {string}, {string} {string}, {string} and submit form")
    public void iRegisterFirstnameLastnameCompanytypeJobtitleCompanyEmailPhonenumberPasswordConfirmpasswordAndSubmitForm(String firstname, String lastname, String accounttype, String jobtitle, String company, String email, String phonenumber, String password, String confirmpassword) {

        registration(firstname, lastname, accounttype, jobtitle, company, email, phonenumber, password, confirmpassword);
    }

    @When("I navigate to registration page")
    public void iNavigateToRegistrationPage() {
        HomePage.registerUrl();
    }

    @When("I complete registration {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and submit form")
    public void iCompleteRegistrationFirstnameLastnameCompanytypeJobtitleCompanyEmailPasswordConfirmpasswordAndSubmitForm(String firstname, String lastname, String accounttype, String jobtitle, String company, String email, String phonenumber, String password, String confirmpassword) {

        registration(firstname, lastname, accounttype, jobtitle, company, email, phonenumber, password, confirmpassword);

        //registerDomain.registerAccount(firstname,lastname, accounttype, jobtitle, company, email, phonenumber, password, confirmpassword);
        /**
         *  register.enterFirstName(firstname)
         *                 .enterLastName(lastname)
         *                 .selectAccountType(accounttype)
         *                 .enterJobTitle(jobtitle)
         *                 .enterCompanyName(company)
         *                 .enterEmail(email)
         *                 .enterPhoneNumber(phonenumber)
         *                 .enterPassword(password)
         *                 .confirmPassword(confirmpassword);
         */
    }

    @Then("Register title is displayed")
    public void registerTitleIsDisplayed() {
        String expected = "Register";
        assertEquals(expected, RegisterPage.getPageTitle());
    }

    private void registration(String firstname, String lastname, String accounttype, String jobtitle, String company, String email, String phonenumber, String password, String confirmpassword) {
        registerDomain.registerAccount(firstname, lastname, accounttype, jobtitle, company, email, phonenumber, password, confirmpassword);
    }
}
