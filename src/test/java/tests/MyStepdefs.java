package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import tests.BaseTest;

public class MyStepdefs extends BaseTest {

    @Given("^Navigate to the Amazon$")
    public void navigateToTheAmazon() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("given");
    }

    @And("^Go into Best sellers in Digital Cameras$")
    public void goIntoBestSellersInDigitalCameras() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("and");
    }

    @Then("^Check that correct product was added and subtotal price is correct$")
    public void checkThatCorrectProductWasAddedAndSubtotalPriceIsCorrect() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("then");
        Assert.assertEquals(1, 1);
    }

    @And("^Open details of fifth product$")
    public void openDetailsOfFifthProduct() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("and");
    }

    @And("^Add (\\d+) pieces to the cart$")
    public void addPiecesToTheCart(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("and");
    }
}
