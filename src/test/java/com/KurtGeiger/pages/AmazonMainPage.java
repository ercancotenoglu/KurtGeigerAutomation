package com.KurtGeiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonMainPage extends BasePage {

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchButtonAmazon;

    @FindBy(xpath= "//input[@id=\"sp-cc-accept\"]")
    public WebElement acceptCookies;

    @FindBy(xpath = "//input[@id=\"nav-search-submit-button\"]")
    public WebElement searchSubmitButton;



}
