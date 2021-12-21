package com.KurtGeiger.stepDefinitions;

import com.KurtGeiger.pages.HomePage;
import com.KurtGeiger.pages.MenPage;
import com.KurtGeiger.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class checkoutPageStepDef {

    HomePage homePage = new HomePage();
    MenPage menPage = new MenPage();


    @And("I am on PDP")
    public void i_am_on_PDP() throws InterruptedException {

        Thread.sleep(1000);
        Driver.get().manage().window().maximize();
        menPage.aProduct.click();

        String actualUrl = "https://www.kurtgeiger.com/men/shoes/trainers/low-tops/lettie-mesh-silver-synthetic-kurt-geiger-london-8827963979";
        String expectedUrl = Driver.get().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        System.out.println("expectedUrl = " + expectedUrl);

    }

    @When("I select any colour and size for the chosen men category")
    public void i_select_any_colour_and_size_for_the_chosen_men_category() throws InterruptedException {

        Thread.sleep(2000);
        menPage.colourMulti.click();
        Thread.sleep(1000);
        menPage.sizeGuide.click();

    }

    @And("I add the product to the bag")
    public void i_add_the_product_to_the_bag() throws InterruptedException {

        Thread.sleep(1000);
        menPage.addToBag.click();

    }

    @Then("I can see the bag with single item")
    public void i_can_see_the_bag_with_single_item() throws InterruptedException {

        Thread.sleep(1000);
        homePage.menCategory.click();
        Thread.sleep(2000);
        menPage.bagLogo.click();
        Thread.sleep(1000);
        menPage.viewMyBag.click();

    }

    @And("I click Proceed to Checkout")
    public void i_click_Proceed_to_Checkout() throws InterruptedException {

        Thread.sleep(1000);
        menPage.checkoutButton.click();

    }

    @Then("I should be on checkout page")
    public void i_should_be_on_checkout_page() throws InterruptedException {

        Thread.sleep(1000);
        String actualUrl = "https://www.kurtgeiger.com/checkout/";
        String expectedUrl = Driver.get().getCurrentUrl();


        Assert.assertEquals(actualUrl,expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        System.out.println("expectedUrl = " + expectedUrl);

        Driver.closeDriver();

    }





}
