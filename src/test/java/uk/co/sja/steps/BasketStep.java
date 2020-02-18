package uk.co.sja.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uk.co.sja.domain.BasketDomain;
import uk.co.sja.pages.BasketPage;
import uk.co.sja.pages.HomePage;

public class BasketStep {

    HomePage homePage = new HomePage();
    BasketDomain basketDomain = new BasketDomain();
    BasketPage basketPage = new BasketPage();

        @Given("I am on userAccount page")
        public void iAmOnUserAccountPage () {
            homePage.basketUrl();
        }

        @When("I click basket button")
        public void iClickBasketButton () {
            basketPage.clickBasketButton();
        }

        @Then("Basket content page is displayed")
        public void basketContentIsDisplayed () {
            basketDomain.verifyBasketContent();
        }
}