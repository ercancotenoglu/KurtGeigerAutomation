package com.KurtGeiger.stepDefinitions;

import com.KurtGeiger.pages.HomePage;
import com.KurtGeiger.utilities.ConfigurationReader;
import com.KurtGeiger.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class carvelaStepDef {

    HomePage homePage = new HomePage();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {

        Driver.get().navigate().to(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        homePage.acceptAllCookies.click();

    }

    @When("I select Carvela category from the header")
    public void i_select_carvela_category_from_the_header() throws InterruptedException {

        Thread.sleep(1000);
        homePage.searchButton.click();
        Thread.sleep(1000);
        homePage.searchButtonInput.sendKeys("Carvela");
        homePage.searchButtonInput.sendKeys(Keys.ENTER);

    }

    @Then("I should see the list of Carvela brand products")
    public void i_should_see_the_list_of_carvela_brand_products() throws InterruptedException {

        Thread.sleep(1000);
        String actualUrl = "https://www.kurtgeiger.com/enrichmentdata/search/index?q=Carvela";
        String expectedUrl = Driver.get().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        System.out.println("expectedUrl = " + expectedUrl);

    }

    @Then("I select Bags from the list")
    public void i_select_bags_from_the_list() throws InterruptedException {

        Thread.sleep(1000);
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(homePage.bagsButton).build().perform();
        Thread.sleep(1000);
        homePage.carvelaUnderBags.click();
    }

    @Then("I should see the list of Carvela Bag products")
    public void i_should_see_the_list_of_carvela_bag_products() throws InterruptedException {

        Thread.sleep(1000);
        String actualUrl = "https://www.kurtgeiger.com/brands/carvela?top_category=bags";
        String expectedUrl = Driver.get().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        System.out.println("expectedUrl = " + expectedUrl);

        Driver.closeDriver();
    }


}
