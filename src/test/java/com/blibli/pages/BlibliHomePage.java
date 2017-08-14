package com.blibli.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BlibliHomePage extends PageObject {
    @FindBy(id = "gdn-login-registrasi")
    private WebElementFacade loginButton;

    @FindBy(id = "gdn-login-modal-body")
    private WebElementFacade popupLoginForm;

    @FindBy(id = "loginEmail")
    private WebElementFacade inputLoginEmail;

    @FindBy(id = "loginPassword")
    private WebElementFacade inputLoginPassword;

    @FindBy(id = "gdn-submit-login")
    private WebElementFacade submitLoginButton;

    @FindBy(id= "gdn-already-login-label")
    private WebElementFacade alreadyLoginUser;

    @FindBy(name = "s")
    private WebElementFacade searchInputText;

    @FindBy(id = "gdn-search-button")
    private WebElementFacade searchGoButton;

    @FindBy(xpath = "//*[@id=\"catalogProductListContentDiv\"]/div[1]/div/a/div/div/div/div[1]/span/img")
    private WebElementFacade firstResultPanel;

    @FindBy(id = "gdn-buy-now-top")
    private WebElementFacade checkoutButton;

    @FindBy(id = "gdn-sb-page-continue-checkout")
    private WebElementFacade alreadyInCheckoutPage;

    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/div[4]/nav/div[2]/button")
    private WebElementFacade goJekButton;

    @FindBy(id = "gdn-next-step")
    private WebElementFacade nextPembayaranButton;

    @FindBy(id = "gdn-payment-option-KlikBCA")
    private WebElementFacade klikBcaSelect;

    @FindBy(id = "payment_userid")
    private WebElementFacade inputBcaUsername;

    @FindBy(id = "gdn-submit-checkout")
    private WebElementFacade submitCheckout;

    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/section/div/div")
    private WebElementFacade checkStatusPengiriman;

    public WebElementFacade getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(WebElementFacade loginButton) {
        this.loginButton = loginButton;
    }

    public WebElementFacade getPopupLoginForm() {
        return popupLoginForm;
    }

    public void setPopupLoginForm(WebElementFacade popupLoginForm) {
        this.popupLoginForm = popupLoginForm;
    }

    public WebElementFacade getInputLoginEmail() {
        return inputLoginEmail;
    }

    public void setInputLoginEmail(WebElementFacade inputLoginEmail) {
        this.inputLoginEmail = inputLoginEmail;
    }

    public WebElementFacade getInputLoginPassword() {
        return inputLoginPassword;
    }

    public void setInputLoginPassword(WebElementFacade inputLoginPassword) {
        this.inputLoginPassword = inputLoginPassword;
    }

    public WebElementFacade getSubmitLoginButton() {
        return submitLoginButton;
    }

    public void setSubmitLoginButton(WebElementFacade submitLoginButton) {
        this.submitLoginButton = submitLoginButton;
    }

    public WebElementFacade getAlreadyLoginUser() {
        return alreadyLoginUser;
    }

    public void setAlreadyLoginUser(WebElementFacade alreadyLoginUser) {
        this.alreadyLoginUser = alreadyLoginUser;
    }

    public WebElementFacade getSearchInputText() {
        return searchInputText;
    }

    public void setSearchInputText(WebElementFacade searchInputText) {
        this.searchInputText = searchInputText;
    }

    public WebElementFacade getSearchGoButton() {
        return searchGoButton;
    }

    public void setSearchGoButton(WebElementFacade searchGoButton) {
        this.searchGoButton = searchGoButton;
    }

    public WebElementFacade getFirstResultPanel() {
        return firstResultPanel;
    }

    public void setFirstResultPanel(WebElementFacade firstResultPanel) {
        this.firstResultPanel = firstResultPanel;
    }

    public WebElementFacade getCheckoutButton() {
        return checkoutButton;
    }

    public void setCheckoutButton(WebElementFacade checkoutButton) {
        this.checkoutButton = checkoutButton;
    }

    public WebElementFacade getAlreadyInCheckoutPage() {
        return alreadyInCheckoutPage;
    }

    public void setAlreadyInCheckoutPage(WebElementFacade alreadyInCheckoutPage) {
        this.alreadyInCheckoutPage = alreadyInCheckoutPage;
    }

    public WebElementFacade getGoJekButton() {
        return goJekButton;
    }

    public void setGoJekButton(WebElementFacade goJekButton) {
        this.goJekButton = goJekButton;
    }

    public WebElementFacade getNextPembayaranButton() {
        return nextPembayaranButton;
    }

    public void setNextPembayaranButton(WebElementFacade nextPembayaranButton) {
        this.nextPembayaranButton = nextPembayaranButton;
    }

    public WebElementFacade getKlikBcaSelect() {
        return klikBcaSelect;
    }

    public void setKlikBcaSelect(WebElementFacade klikBcaSelect) {
        this.klikBcaSelect = klikBcaSelect;
    }

    public WebElementFacade getInputBcaUsername() {
        return inputBcaUsername;
    }

    public void setInputBcaUsername(WebElementFacade inputBcaUsername) {
        this.inputBcaUsername = inputBcaUsername;
    }

    public WebElementFacade getSubmitCheckout() {
        return submitCheckout;
    }

    public void setSubmitCheckout(WebElementFacade submitCheckout) {
        this.submitCheckout = submitCheckout;
    }

    public WebElementFacade getCheckStatusPengiriman() {
        return checkStatusPengiriman;
    }

    public void setCheckStatusPengiriman(WebElementFacade checkStatusPengiriman) {
        this.checkStatusPengiriman = checkStatusPengiriman;
    }
}
