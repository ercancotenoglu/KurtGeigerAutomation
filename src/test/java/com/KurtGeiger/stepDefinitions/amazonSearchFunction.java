package com.KurtGeiger.stepDefinitions;

import com.KurtGeiger.pages.AmazonMainPage;
import com.KurtGeiger.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class amazonSearchFunction {

AmazonMainPage amazonMainPage = new AmazonMainPage();

    @Given("I'm on amazon's homepage.")
    public void i_m_on_amazon_s_homepage() {
        Driver.get().navigate().to("https://www.amazon.co.uk");
        Driver.get().manage().window().maximize();
       // amazonMainPage.acceptCookies.click();
    }

    @When("I navigate to search button of the amazon.")
    public void i_navigate_to_search_button_of_the_amazon() throws InterruptedException {
        Thread.sleep(1000);
        amazonMainPage.searchButtonAmazon.click();

    }

    @Then("I enter the product i am looking for {string}")
    public void i_enter_the_product_i_am_looking_for(String product) throws InterruptedException {
        Thread.sleep(1000);
        amazonMainPage.searchButtonAmazon.sendKeys(product);

    }

    @Then("Hit the Enter or Click Submit button")
    public void hit_the_Enter_or_Click_Submit_button() throws InterruptedException {
        Thread.sleep(1000);
       amazonMainPage.searchSubmitButton.click();
    }

    @Then("I should see the list of {string} products")
    public void i_should_see_the_list_of_products(String product) throws InterruptedException {


        Thread.sleep(1000);
        String actualUrl = Driver.get().getCurrentUrl();

        System.out.println("actualUrl = " + actualUrl);

        Assert.assertTrue(actualUrl,actualUrl.contains("children"));

    }

    @Then("I enter NO any product name.")
    public void i_enter_NO_any_product_name() throws InterruptedException {

        Thread.sleep(1000);
        amazonMainPage.searchButtonAmazon.sendKeys("");

    }

    @Then("I should still see the main page with no any specific product.")
    public void i_should_still_see_the_main_page_with_no_any_specific_product() {

        String actualUrl = "https://www.amazon.co.uk/";
        String expectedUrl = Driver.get().getCurrentUrl();



        Assert.assertEquals(actualUrl,expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        System.out.println("expectedUrl = " + expectedUrl);

    }











}
