package com.blibli.steps;

import com.blibli.Behaviour.BlibliHomePageBehaviour;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.blibli.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Steps
    BlibliHomePageBehaviour blibliHomePageBehaviour;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }

    @Given("open home page")
    public void givenOpenHomepage() {
        blibliHomePageBehaviour.open();
    }

    @When("I login to blibli")
    public void whenLoginHomepage() {
        blibliHomePageBehaviour.clickuserLogin();
    }

    @Then("I can see my name in the site")
    public void thenSeeMyName() {
        blibliHomePageBehaviour.checkUserAlreadyLoggedin();
    }

    @Given("already login")
    public void givenOpenHome() {
        blibliHomePageBehaviour.checkUserAlreadyLoggedin();
    }

    @When("I search for ayam")
    public void whenSearchAyam() {
        blibliHomePageBehaviour.searchAyam();
    }

    @Then("I can see ayam's detail")
    public void thenSeeCheckoutButton() {
        blibliHomePageBehaviour.checkAyamAlreadyChecked();
    }


    @Given("already choose ayam")
    public void givenOpenCheckoutPage() {
        blibliHomePageBehaviour.checkAyamAlreadyChecked();
    }

    @When("I choose to pay with Klik BCA")
    public void whenPayWithBca() {
        blibliHomePageBehaviour.checkOutAyam();
    }

    @Then("I submit the payment")
    public void thenCheckPay() {
        blibliHomePageBehaviour.checkFinalCheckout();
    }
}
