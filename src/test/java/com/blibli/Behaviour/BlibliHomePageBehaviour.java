package com.blibli.Behaviour;

import com.blibli.pages.BlibliHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.concurrent.TimeUnit;

public class BlibliHomePageBehaviour extends ScenarioSteps {
    BlibliHomePage blibliHomePage;

    @Step
    public void open() {
        getDriver().get("https://www.blibli.com");
    }

    @Step
    public void clickuserLogin() {
        blibliHomePage.getLoginButton().click();
        blibliHomePage.getPopupLoginForm().waitUntilPresent().withTimeoutOf(5, TimeUnit.SECONDS);
//        blibliHomePage.getInputLoginEmail().type("bfp_testqa@mailinatar.com");
//        blibliHomePage.getInputLoginPassword().type("bfp_testqa123");
        blibliHomePage.getInputLoginEmail().type("asdf");
        blibliHomePage.getInputLoginPassword().type("1234");
        blibliHomePage.getSubmitLoginButton().click();
    }

    @Step
    public void checkUserAlreadyLoggedin() {
        blibliHomePage.getAlreadyLoginUser().isCurrentlyVisible();
    }

    @Step
    public void searchAyam() {
        blibliHomePage.getSearchInputText().type("ayam");
        blibliHomePage.getSearchGoButton().click();
        blibliHomePage.getGoJekButton().click();
        blibliHomePage.getFirstResultPanel().waitUntilPresent().withTimeoutOf(5, TimeUnit.SECONDS).click();
        blibliHomePage.getCheckoutButton().waitUntilPresent().withTimeoutOf(5, TimeUnit.SECONDS).click();
    }

    @Step
    public void checkAyamAlreadyChecked() {
        blibliHomePage.getAlreadyInCheckoutPage().isCurrentlyVisible();
    }

    @Step
    public void checkOutAyam() {
        blibliHomePage.getAlreadyInCheckoutPage().click();
        blibliHomePage.getNextPembayaranButton().click();
        blibliHomePage.getKlikBcaSelect().click();
        blibliHomePage.getInputBcaUsername().type("asdfasdf");
        blibliHomePage.getSubmitCheckout().waitUntilPresent().withTimeoutOf(2, TimeUnit.SECONDS).click();
    }

    @Step
    public void checkFinalCheckout() {
        blibliHomePage.getCheckStatusPengiriman().isCurrentlyVisible();
    }
}
