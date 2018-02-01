package tests;

import Base.BaseUtli;
import actions.Shopping;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class MyStepdefs extends BaseUtli{

    private BaseUtli base;
    Shopping shopping = new Shopping(Driver);

    public MyStepdefs(BaseUtli base){
        this.base = base;
    }

    @Given("^Navigate to the Amazon$")
    public void navigateToTheAmazon() throws Throwable {
        String baseUrl = "http://amazon.com";
        Driver.navigate().to(baseUrl);
    }

    @And("^Go into Best sellers in Digital Cameras$")
    public void goIntoBestSellersInDigitalCameras() throws Throwable {
        shopping.goIntoBestSellerDigitalCameras();
    }

    @And("^Open details of (\\d+)-th product product$")
    public void openDetailsOfThProductProduct(int arg0) throws Throwable {
        shopping.openDetailsOfNthCamera(arg0);
    }

    @And("^Add (\\d+) pieces to the cart$")
    public void addPiecesToTheCart(int arg0) throws Throwable {
        shopping.getProductInfo(arg0);
        shopping.orderProducts(arg0);
    }

    @Then("^Check that correct product was added and subtotal price is correct$")
    public void checkThatCorrectProductWasAddedAndSubtotalPriceIsCorrect() throws Throwable {
        shopping.openCart();
        shopping.checkNameofProduct();
        shopping.checkSubtotalPrice();
    }
}
