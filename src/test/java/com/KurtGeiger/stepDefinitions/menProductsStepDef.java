package com.KurtGeiger.stepDefinitions;

import com.KurtGeiger.pages.HomePage;
import com.KurtGeiger.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class menProductsStepDef {


        HomePage homePage = new HomePage();

    @And("I select men category from the header")
    public void i_select_men_category_from_the_header() throws InterruptedException {

       Thread.sleep(1000);
       Driver.get().manage().window().maximize();
       homePage.menCategory.click();

    }

    @Then("I should see the list of products")
    public void i_should_see_the_list_of_products() throws InterruptedException {

         Thread.sleep(1000);
         homePage.category.click();
         Thread.sleep(1000);
         homePage.shoesMenSubCategory.click();
         Thread.sleep(500);

        String actualUrl = "https://www.kurtgeiger.com/men";
        String expectedUrl = Driver.get().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        System.out.println("expectedUrl = " + expectedUrl);

    }

    @When("I select boots category")
    public void i_select_boots_category() throws InterruptedException {

        Thread.sleep(1000);
        homePage.category.click();
        Thread.sleep(1000);
        homePage.shoesMenSubCategory.click();
        Thread.sleep(1000);
        homePage.category.click();
        Thread.sleep(1000);
        homePage.boots.click();

    }

    @Then("I should see only boots")
    public void i_should_see_only_boots() {

        String actualUrl = "https://www.kurtgeiger.com/men/shoes/boots";
        String expectedUrl = Driver.get().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        System.out.println("expectedUrl = " + expectedUrl);

        Driver.closeDriver();
    }



}
