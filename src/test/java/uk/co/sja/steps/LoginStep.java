package uk.co.sja.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uk.co.sja.domain.LoginDomain;
import uk.co.sja.domain.RegisterDomain;
import uk.co.sja.pages.HomePage;
import uk.co.sja.pages.LoginPage;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class LoginStep {

    HomePage homePage = new HomePage();
    LoginDomain loginDomain = new LoginDomain();
    LoginPage loginPage = new LoginPage();


    @And("l click login register")
    public void lClickLoginRegisterLink () {
        homePage.clickLoginRegisterLink();
    }

   @When("I enter {string}, {string} and submit form")
    public void iEnterUsernamePasswordAndSubmitForm (String email, String password) throws InterruptedException {
      loginDomain.signIn(email, password);
    }

    @Then("account is displayed on page")
    public void usernameIsDisplayedOnPage() {
        loginDomain.verifyUserAccount();
    }



}
